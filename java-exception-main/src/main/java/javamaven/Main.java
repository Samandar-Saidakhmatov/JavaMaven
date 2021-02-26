package javamaven;
import javamaven.model.Faculty;
import javamaven.model.Group;
import javamaven.model.Student;
import javamaven.model.University;

public class Main {

   public static void main(String[] args) throws Exception {
      //Students
      Student student1 = new Student("Bob");
      Student student2 = new Student("Tom");
      Student student3 = new Student("Kim");
      Student student4 = new Student("Tomas");
      Student student5 = new Student("Philip");
      Student student6 = new Student("Bin");


      //Adding subjects to each student
      student1.addSubject("Algorithm",5);
      student1.addSubject("Math", 4);
      student1.addSubject("Russian",3);

      student2.addSubject("Algorithm",3);
      student2.addSubject("Math", 5);
      student2.addSubject("Russian",3);

      student3.addSubject("Algorithm",3);
      student3.addSubject("Math", 4);
      student3.addSubject("Russian",3);

      student4.addSubject("Algorithm",5);
      student4.addSubject("Math", 3);
      student4.addSubject("Russian",5);

      student5.addSubject("Algorithm",5);
      student5.addSubject("Math", 5);
      student5.addSubject("Russian",5);

      student6.addSubject("Algorithm",2);
      student6.addSubject("Math", 3);
      student6.addSubject("Russian",5);


      System.out.println("Middle mark of student:"+"\n");
      System.out.println(student1.name+"'s middle mark in all subjects: "+student1.middleMarkOfStudentInAllSubjects());
      System.out.println(student2.name+"'s middle mark in all subjects: "+student2.middleMarkOfStudentInAllSubjects());
      System.out.println(student3.name+"'s middle mark in all subjects: "+student3.middleMarkOfStudentInAllSubjects());
      System.out.println(student4.name+"'s middle mark in all subjects: "+student4.middleMarkOfStudentInAllSubjects());
      System.out.println(student5.name+"'s middle mark in all subjects: "+student5.middleMarkOfStudentInAllSubjects());
      System.out.println(student6.name+"'s middle mark in all subjects: "+student6.middleMarkOfStudentInAllSubjects()+"\n");

      //Groups
      Group group100 = new Group(100);
      Group group200 = new Group(200);

      Group group300 = new Group(300);

      //Adding students to each groups
      group100.addStudent(student1);
      group100.addStudent(student2);

      group200.addStudent(student3);
      group200.addStudent(student4);

      group300.addStudent(student5);
      group300.addStudent(student6);

      System.out.println(group100);
      System.out.println(group200);
      System.out.println(group300+"\n");

      System.out.println("Middle mark of current subject in "+ group100.groupNumber+" group"+": "+group100.middleMarkOfGroup("Algorithm"));
      System.out.println("Middle mark of current subject in "+ group200.groupNumber+" group"+": "+group200.middleMarkOfGroup("Math"));
      System.out.println("Middle mark of current subject in "+ group300.groupNumber+" group"+": "+group300.middleMarkOfGroup("Russian"));


      //Faculties
      Faculty facultyComputerScience = new Faculty("ComputerScience");
      Faculty facultyTelecom = new Faculty("Telecommunication");

      //Adding groups to each faculties
      facultyComputerScience.addGroup(group100);
      facultyComputerScience.addGroup(group200);

      facultyTelecom.addGroup(group300);

      System.out.println("\n"+"Middle mark of current subject in "+facultyComputerScience.name + " faculty: " + facultyComputerScience.middleMarkOfFaculty("Math"));
      System.out.println("Middle mark of current subject in "+facultyTelecom.name + " faculty: " + facultyTelecom.middleMarkOfFaculty("Math"));

      //University
      University university = new University();

      //Adding faculties to the university
      university.addFaculty(facultyComputerScience);
      university.addFaculty(facultyTelecom);

      System.out.println("\n"+"Middle mark of current subject in the University: "+university.middleMarkOfUniversity("Russian"));

   }
}