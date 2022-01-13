package student;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// It's a service (i.e. Spring Bean) -> Now Controller knows where to find this service
// This class is meant to be a Service class
@Service
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
