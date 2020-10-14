package practice02;

public class Student extends Person{
    private int kClass;

    public Student(String name, int age, int kClass) {
        super(name, age);
        this.kClass = kClass;
    }

    public int getKlass() { return kClass; }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class "+kClass+".";
    }
}
