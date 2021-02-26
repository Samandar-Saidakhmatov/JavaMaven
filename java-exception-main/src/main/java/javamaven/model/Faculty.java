package javamaven.model;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    public String name;
    public List<Group> groupList;

    public Faculty(String name) {
        this.name = name;
        groupList = new ArrayList<>();

    }

    public void addGroup(Group group) throws NullPointerException {
        if(group == null) {
            throw new NullPointerException("Lack of groups in faculty " + groupList);
        }
        groupList.add(group);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groupList;
    }


    public void setGroups(List<Group> groups) {
        this.groupList = groups;
    }


    //middle mark of current subject in current faculty
    public int middleMarkOfFaculty(String subject) {
        int totalMark = 0;
        int countStudents = 0;
        for (Group group : groupList) {
            for (Student student : group.studentsList) {
                for (Subject currentSubject : student.subjectList) {
                    if (currentSubject.subjectName.equals(subject))
                    totalMark = totalMark + currentSubject.mark;
                }

                countStudents++;
            }

        }
        return totalMark / countStudents;
    }



        @Override
        public String toString () {
            return "Faculty{" +
                    "name='" + name + '\'' +
                    ", groups=" + groupList +
                    '}';
        }
}
