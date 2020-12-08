package course.project.dao;

import course.project.dto.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Here we use JpaRepository using that repository we have all CRUD funs, like update,delete abd all.
@Repository
public interface ICourseDAO extends JpaRepository<Course, Integer> {

}
