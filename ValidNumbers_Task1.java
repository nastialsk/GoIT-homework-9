import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidNumbers {
    private static final String line = "file.txt";

    static String stringCheckResult(String line) {
        Matcher patternMatcher = Pattern.compile("(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}").matcher(line);
        return patternMatcher.matches() ? "OK" : "ERROR";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader inputFileReader = new BufferedReader(new FileReader(line));
        String currentFileString;
        while ((currentFileString = inputFileReader.readLine()) != null) {
            System.out.println(currentFileString + " - " + stringCheckResult(currentFileString));
        }
        inputFileReader.close();
    }
}
