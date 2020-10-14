package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private LinkedList<Klass> klassList;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klassList) {
        super(id, name, age);
        this.klassList = klassList;
    }

    @Override
    public String introduce() {
        if (klassList != null && klassList.size() > 0) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach Class " + returnClassString() + ".";
        } else {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Teacher. I teach "+student.getName()+".";
        } else {
            return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }

    public LinkedList<Klass> getClasses() {
        return klassList;
    }

    public String returnClassString(){
        return klassList.stream().map(klass -> String.valueOf(klass.getNumber())).collect( Collectors.joining( ", " ) );
    }


    public boolean isTeaching(Student student) {
        return klassList.stream().anyMatch(klass -> klass.isIn(student));
    }
}
