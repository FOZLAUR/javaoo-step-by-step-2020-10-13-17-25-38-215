package practice10;

import java.util.Arrays;
import java.util.LinkedList;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> klassList;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

//    public Teacher(int id, String name, int age, Klass klass) {
//        super(id, name, age);
//        this.klass = klass;
//    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klassList) {
        super(id, name, age);
        this.klassList = klassList;
    }

    public Klass getKlass() { return klass; }

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
        String str = "";
        for(int i=0; i<klassList.size(); i++){
            str+=klassList.get(i).getNumber();
            if(i!=klassList.size()-1){
                str+=", ";
            }
        }
        return str;
    }


    public boolean isTeaching(Student student) {
        for(Klass klass : klassList){
            if(klass.isIn(student)){
                return true;
            }
        }
        return false;
    }
}
