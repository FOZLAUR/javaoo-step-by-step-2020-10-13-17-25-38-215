package practice09;

public class Student extends Person{
    private Klass klass;
    private boolean isLeader;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        isLeader = false;
    }

    public Klass getKlass() { return klass; }


    public void setLeader() {
        isLeader = true;
    }

    @Override
    public String introduce() {
        if(isLeader) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        } else {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
        }
    }
}
