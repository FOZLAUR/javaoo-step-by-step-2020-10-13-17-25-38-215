package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student studentLeader;
    private List<Student> studentList;

    public Klass(int number){
        this.number = number;
        studentList = new ArrayList<Student>();
    }

    public int getNumber() { return number; }

    public String getDisplayName() { return "Class "+number; }

    public void assignLeader(Student student) {
        if(student.getKlass().getNumber() == number) {
            student.setLeader();
            studentLeader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return studentLeader;
    }

    public void appendMember(Student student) {
        if(student.getKlass().getNumber() == number) {
            studentList.add(student);
        } else {
            System.out.print("It is not one of us.\n");
        }
    }
}
