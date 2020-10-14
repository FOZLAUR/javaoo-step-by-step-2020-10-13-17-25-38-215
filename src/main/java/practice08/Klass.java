package practice08;

public class Klass {
    private int number = -1;
    private Student studentLeader;

    public Klass(int number){
        this.number = number;
    }

    public int getNumber() { return number; }

    public String getDisplayName() { return "Class "+number; }

    public void assignLeader(Student student) {
        student.setLeader();
        studentLeader = student;
    }

    public Student getLeader() {
        return studentLeader;
    }
}
