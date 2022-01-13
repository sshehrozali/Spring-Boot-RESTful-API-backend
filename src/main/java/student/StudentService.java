package student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1,
                        "Ayesha",
                        LocalDate.of(2000, Month.JANUARY, 13)
                )
        );
    }
}
