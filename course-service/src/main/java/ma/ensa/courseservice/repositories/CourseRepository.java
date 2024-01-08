package ma.ensa.courseservice.repositories;

import ma.ensa.courseservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
