class Json {
    private static final String line = "file.txt";
    private String name;
    private int age;

    public void main(String[] args) {
        String lines[] = line.split("\\r?\\n");
        for (int i = 1; i <= lines.length; i++) {
            if (lines[i].matches("[\\p{L}| ]+")) {
                lines[i] = (String) name;
            }
            lines[i] = String.valueOf(age);
            System.out.println("name" + " = " + name + "; age " + "= ");
        }
    }
}
