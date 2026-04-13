@RestController
@RequestMapping("/api")
public class StudentController {
    @GetMapping("/registration")
    public String getDetails() {
        return "Student Name: John Doe, Course: Cloud Computing, Status: Registered";
    }
}
