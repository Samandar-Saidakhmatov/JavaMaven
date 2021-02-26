//package javamaven.model;
//
//import junit.framework.TestCase;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertThat;
//
//public class UniversityManagerTest {
//
//    @Test
//    public void successTestCountFacultyOfUniversity() {
//        Faculty faculty1 = new Faculty();
//        Faculty faculty2 = new Faculty();
//        Faculty faculty3 = new Faculty();
//
//        faculty1.setName("math");
//        faculty2.setName("rus");
//        faculty3.setName("eng");
//
//        List<Faculty> faculties = new ArrayList<>();
//        faculties.add(faculty1);
//        faculties.add(faculty2);
//        faculties.add(faculty3);
//
//        University university = new University();
//        university.setFaculties(faculties);
//
//        UniversityMark universityManager = new UniversityMark();
//        int countFaculty = universityManager.countFacultyOfUniversity(university);
//
//        assertThat(faculties.size(), equalTo(countFaculty));
//    }
//}