package student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    // REST Endpoint
    @GetMapping
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
