package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() { return klass; }

    @Override
    public String introduce() {
        if (klass != null && klass.getNumber() > 0) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + klass.getNumber() + ".";
        } else {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().equals(getKlass())) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach "+student.getName()+".";
        } else {
            return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}
