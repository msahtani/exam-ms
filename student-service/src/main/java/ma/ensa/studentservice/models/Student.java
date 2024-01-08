package ma.ensa.studentservice.models;


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
public class Student {

    @Id
    @GeneratedValue(generator="stu_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="stu_seq", allocationSize = 1)
    private long id;

    private String fullName;

    private String classe;

    @OneToMany(mappedBy="student")
    private List<CourseStudent> courses;

}
