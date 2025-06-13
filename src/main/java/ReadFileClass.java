import model.Student;
import model.StudyProfile;
import model.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import java.util.List;


public class ReadFileClass {
    List<Student> studentList;
    List<University> universityList;

    private ReadFileClass() {
        // приватный конструктор
        this.studentList = new ArrayList<>();
        this.universityList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    private static ReadFileClass instance;
//    private List<University> universities = new ArrayList<>();
//    private List<Student> students = new ArrayList<>();


    public static ReadFileClass getInstance() {
        if (instance == null) {
            instance = new ReadFileClass();
        }
        return instance;
    }


    public void readXlsx() {

        try (InputStream inputStream = getClass().getResourceAsStream("/universityInfo.xlsx")) {

            if (inputStream == null) {
                System.err.println("Файл universityInfo.xlsx не найден в ресурсах");
                return;
            }
            Workbook workbook = new XSSFWorkbook(inputStream);
            addListStudent(workbook);
            addListUniver(workbook);

//            System.out.println(studentList);
//            System.out.println(universityList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addListStudent(Workbook workbook){
        Sheet studentSheet = workbook.getSheet("Студенты");
        if (studentSheet == null) {
            System.err.println("Лист 'Студенты' не найден в файле.");
        } else {
//            System.out.println("studenrs:");
        }
        Iterator<Row> iteratorStudents = studentSheet.iterator();
        if (iteratorStudents.hasNext()) {

            Row headerRowStudents = iteratorStudents.next(); // Пропускаем заголовок
        }
        while (iteratorStudents.hasNext()) {
            Row currentRow = iteratorStudents.next();

            Cell cell1 = currentRow.getCell(0); // Столбец A (индекс 0)
            Cell cell2 = currentRow.getCell(1); // Столбец B (индекс 1)
            Cell cell3 = currentRow.getCell(2); // Столбец C (индекс 2)
            Cell cell4 = currentRow.getCell(3); // Столбец D (индекс 3)

            if (cell1 != null && cell2 != null && cell3 != null && cell4 != null) {

                studentList.add(new Student(cell1.getStringCellValue(), cell2.getStringCellValue(), (int) cell3.getNumericCellValue(),
                        (float) cell4.getNumericCellValue()));
            }
        }
    }
    public void addListUniver(Workbook workbook){
        Sheet univerSheet = workbook.getSheet("Университеты");
        if (univerSheet == null) {
            System.err.println("Лист 'Университеты' не найден в файле.");
        } else {
//            System.out.println("universitets:");
        }

        Iterator<Row> iteratorUniver = univerSheet.iterator();
        if (iteratorUniver.hasNext()) {
            Row headerRowUniver = iteratorUniver.next(); // Пропускаем заголовок
        }
        while (iteratorUniver.hasNext()) {
            Row currentRow = iteratorUniver.next();

            Cell cell1 = currentRow.getCell(0); // Столбец A (индекс 0)
            Cell cell2 = currentRow.getCell(1); // Столбец B (индекс 1)
            Cell cell3 = currentRow.getCell(2); // Столбец C (индекс 2)
            Cell cell4 = currentRow.getCell(3); // Столбец D (индекс 3)
            Cell cell5 = currentRow.getCell(4); // Столбец E (индекс 4)

            if (cell1 != null && cell2 != null && cell3 != null && cell4 != null && cell5 != null) {

                universityList.add(new University(
                        cell2.getStringCellValue(), // fullName
                        cell1.getStringCellValue(), // id
                        StudyProfile.valueOf(cell5.getStringCellValue()), // mainProfile (преобразованная строка)
                        cell3.getStringCellValue(), // shortName
                        (int) cell4.getNumericCellValue() // yearOfFoundation
                ));
            }
        }
    }
}

