package practice06;

public class Teacher extends Person{
    private int klass = -1;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() { return klass; }

    @Override
    public String introduce() {
        if (klass > 0) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + klass + ".";
        } else {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        }
    }
}
