package Controller;

import Model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    public ResponseEntity<String> addStudent(Student student){
        System.out.println("Student added" + student);
        return ResponseEntity.ok().body(student.getRollNo());
    }
}
