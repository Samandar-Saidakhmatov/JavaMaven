package javamaven.model;


public class Subject {

    public String subjectName;
    public int mark;

    public Subject(String name, int mark) {
        this.subjectName = name;
        this.mark = mark;
    }

    public String getName() {
        return subjectName;
    }

    public void setName(String name) {
        this.subjectName = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + subjectName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
