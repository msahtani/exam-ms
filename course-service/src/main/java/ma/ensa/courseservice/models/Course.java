package ma.ensa.courseservice.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Course {


    @Id
    @GeneratedValue(generator="course_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="course_seq", allocationSize = 1)
    private long id;

    private String name;

    private String prof;

    @OneToMany(mappedBy = "course")
    private List<StudentCourse> students;


}
