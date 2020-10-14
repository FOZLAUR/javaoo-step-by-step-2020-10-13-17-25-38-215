package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }

        Person c = (Person) o;

        return Integer.compare(id, c.id) == 0 && name.equals(c.name) && Integer.compare(age, c.age) == 0;
    }
}
