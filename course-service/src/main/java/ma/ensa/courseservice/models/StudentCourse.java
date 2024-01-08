package ma.ensa.courseservice.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class StudentCourse {

    @Id
    @GeneratedValue(generator="stu_course_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="stu_course_seq", allocationSize = 1)
    private Long id;

    private Long studentId;

    @ManyToOne
    private Course course;

}