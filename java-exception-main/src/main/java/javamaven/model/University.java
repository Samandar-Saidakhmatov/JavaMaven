package javamaven.model;

import java.util.ArrayList;
import java.util.List;

public class University {

    public List<Faculty> facultiesList;

    public University() {
        facultiesList = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty){
        if(faculty == null) {
            throw new NullPointerException("Lack of faculties in the University " +facultiesList);
        }
        facultiesList.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return facultiesList;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.facultiesList = faculties;
    }

    //middle mark of current subject in the university
    public int middleMarkOfUniversity(String subject){
        int totalMark =0;
        int countStudents = 0;
        for (Faculty faculty : facultiesList) {
            for (Group group : faculty.groupList){
                for (Student student : group.studentsList){
                    for(Subject currentSubject : student.getSubjects()){
                        if(currentSubject.subjectName.equals(subject)){
                            totalMark = totalMark + currentSubject.mark;
                        }
                    }
                    countStudents++;
                }
            }

        }
        return totalMark/countStudents;
    }


    @Override
    public String toString() {
        return "University{" +
                "faculties=" + facultiesList +
                '}';
    }
}