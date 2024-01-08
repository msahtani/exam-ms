package ma.ensa.courseservice.services;


import lombok.RequiredArgsConstructor;
import ma.ensa.courseservice.dto.CourseDto;
import ma.ensa.courseservice.models.Course;
import ma.ensa.courseservice.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository repository;

    public String addCourse(CourseDto dto){

        var course = Course.builder()
                .name(dto.getName())
                .prof(dto.getProf())
                .build();

        repository.save(course);

        return "COURSE ADDED SUCCESSFULLY";

    }

    public List<Course> getAllCourses() {

        return repository.findAll();

    }


    public Course getCourseById(long id){
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("COURSE NOT FOUND")
                );
    }
}
