package ma.ensa.studentservice.controllers;

import lombok.RequiredArgsConstructor;
import ma.ensa.studentservice.dto.StudentDto;
import ma.ensa.studentservice.models.Student;
import ma.ensa.studentservice.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping
    public String createStudent(@RequestBody StudentDto dto){
        return studentService.createStudent(dto);
    }


}