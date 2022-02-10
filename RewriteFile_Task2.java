import com.google.json.Json;
import com.google.json.JsonBuilder;

class JsonTest {
    private static final String line = "file.txt";

    public static void main(String[] args) {
        String lines[] = line.split("\\r?\\n");
        for (int i=1; i<=lines.length; i++) {
            Person person = new Person(lines[i]);

            Json json = new JsonBuilder().setPrettyPrinting().create();
            String json = json.toJson(person);

            System.out.println(json);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
