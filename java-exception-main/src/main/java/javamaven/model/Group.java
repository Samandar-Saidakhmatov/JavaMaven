package javamaven.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public int groupNumber;
    public List<Student> studentsList;

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        studentsList = new ArrayList<>();
    }

    public void addStudent(Student student)throws NullPointerException{
        if(student == null) {
            throw new NullPointerException("Lack of students in group " + studentsList);
            }

        studentsList.add(student);

    }

    public List<Student> getStudents() {
        return studentsList;
    }

    public void setStudents(List<Student> students) {
        this.studentsList = students;
    }

    //middle mark of current subject in current group
    public int middleMarkOfGroup(String subject){
        int totalMark = 0;
        int countStudents = 0;
        for (Student student : studentsList) {
            for (Subject currentSubject : student.getSubjects()){
                if (currentSubject.subjectName.equals(subject))
                    totalMark = totalMark + currentSubject.mark;
            }
            countStudents++;
        }
        return totalMark/countStudents;
    }

    @Override
    public String toString() {
        return "Group "+groupNumber+": " +
                "students = " + studentsList +"";
    }
}