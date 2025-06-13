import model.Student;
import model.StudyProfile;
import model.University;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFileClass readFileClass=ReadFileClass.getInstance();
        readFileClass.readXlsx();

    }
}
