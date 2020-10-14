package practice05;

public class Student extends Person{
    private int kClass;

    public Student(String name, int age, int kClass) {
        super(name, age);
        this.kClass = kClass;
    }

    public int getKlass() { return kClass; }

    @Override
    public String introduce() {
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am at Class "+kClass+".";
    }
}
