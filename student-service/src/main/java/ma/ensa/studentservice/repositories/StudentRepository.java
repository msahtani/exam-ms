package ma.ensa.studentservice.repositories;

import ma.ensa.studentservice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {




}
