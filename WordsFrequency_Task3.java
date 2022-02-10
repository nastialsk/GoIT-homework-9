class FrequencyTest {
    private static final String line = "words.txt";

    public static void main(String[] args) {
        int wordNumber = line.split("\\r?\\n").length + line.split(" ").length;
        String[] lines = new String[wordNumber];
        lines = line.split("\\r?\\n");
        int count = 0;
        for (int i = 0; i <= lines.length; i++) {
            for (int j = 1; j <= lines.length; j++) {
                if (lines[i].equals(lines[j])) count++;
                System.out.println(lines[i].toString() + count);

            }
        }
    }
}
