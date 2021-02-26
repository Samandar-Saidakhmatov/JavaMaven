package javamaven.model;


import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public List<Subject> subjectList;

    public Student(String name) {
        this.name = name;
        subjectList = new ArrayList<>();
    }


    public void addSubject(String subjectName, Integer mark) throws Exception {

        try {
            if(subjectName == null){
                throw new NullPointerException("Lack of subjects for the student "+": "+subjectList);
            }
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

        if(mark < 0 || mark >10){
            throw new Exception("Exception, if mark more than 10 or less than 0: "+subjectName+" = "+mark);
        }
            Subject subject = new Subject(subjectName,mark);
            subjectList.add(subject);
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjectList;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjectList = subjects;
    }

    //middle mark of all subjects in current student
    public int middleMarkOfStudentInAllSubjects(){
        int totalMark = 0;
        int countSub = 0;
        for (Subject subject : subjectList ) {
            totalMark = totalMark + subject.mark;
            countSub++;
        }
        return totalMark/countSub;
    }


        @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", subjects = " + subjectList +"";
    }
}
