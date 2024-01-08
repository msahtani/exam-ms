package ma.ensa.studentservice.models;


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
public class CourseStudent {

    @Id
    @GeneratedValue(generator="course_stu_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="course_stu_seq", allocationSize = 1)
    private long id;

    private long courseId;

    @ManyToOne
    private Student student;


}
