import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("h", "one", 1, 3.3f);
        Student student1 = new Student("h1", "two", 2, 4.1f);
        Student student2 = new Student("h2", "three", 3, 4.88f);
        List<Student> studentList = new ArrayList<>();
        List<University> universityList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        System.out.println(studentList.get(0));
        System.out.println(studentList.get(1));
        System.out.println(studentList.get(2));

        System.out.println("------------------------");
        University university = new University();
        University university2 = new University();
        University university3 = new University();

        university.setFullName("Univer1");
        university.setId("0");
        university.setShortName("shortNameUniver1");
        university.setYearOfFoundation(2021);
        university.setMainProfile(StudyProfile.MEDICINE);

        university2.setFullName("Univer2");
        university2.setId("1");
        university2.setShortName("shortNameUniver2");
        university2.setYearOfFoundation(2022);
        university2.setMainProfile(StudyProfile.ENGINEERING);

        university3.setFullName("Univer3");
        university3.setId("2");
        university3.setShortName("shortNameUniver3");
        university3.setYearOfFoundation(2024);
        university3.setMainProfile(StudyProfile.ARTS);

        universityList.add(university);
        universityList.add(university2);
        universityList.add(university3);
        System.out.println(universityList.get(0));
        System.out.println(universityList.get(1));
        System.out.println(universityList.get(2));
    }
}
