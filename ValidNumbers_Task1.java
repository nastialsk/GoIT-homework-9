import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidNumbers {
   private static final File file = new File("C:\\file.txt");

    static String stringCheckResult(String file) {
        Matcher patternMatcher = Pattern.compile("(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}").matcher(file);
        return String.valueOf(patternMatcher.matches());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader inputFileReader = new BufferedReader(new FileReader(file));
        String currentFileString;
        while ((currentFileString = inputFileReader.readLine()) != null) {
            System.out.println(currentFileString + " - " + stringCheckResult(currentFileString));
        }
        inputFileReader.close();
    }
}
