package ma.ensa.courseservice.controllers;


import lombok.RequiredArgsConstructor;
import ma.ensa.courseservice.dto.CourseDto;
import ma.ensa.courseservice.models.Course;
import ma.ensa.courseservice.services.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;


    @GetMapping
    public List<Course> getAllCourses(){
        return service.getAllCourses();
    }

    @PostMapping
    public String addCourse(@RequestBody CourseDto dto){
        return service.addCourse(dto);
    }


}