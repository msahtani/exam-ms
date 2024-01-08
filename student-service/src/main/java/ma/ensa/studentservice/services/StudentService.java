package ma.ensa.studentservice.services;


import lombok.RequiredArgsConstructor;
import ma.ensa.studentservice.dto.StudentDto;
import ma.ensa.studentservice.models.Student;
import ma.ensa.studentservice.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;



    public List<Student> getAllStudents(){
        return repository.findAll();
    }


    public Student getStudentById(Long id){
        return repository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("STUDENT NOT FOUND")
                );
    }


    public String createStudent(StudentDto dto){

        var student = Student.builder()
                .fullName(dto.getFullName())
                .classe(dto.getClasse())
                .build();


        repository.save(student);


        return "Student Created Successfully";
    }


}
