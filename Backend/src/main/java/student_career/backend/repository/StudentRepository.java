package student_career.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student_career.backend.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}