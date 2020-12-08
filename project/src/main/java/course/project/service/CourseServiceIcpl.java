package course.project.service;

import course.project.dao.ICourseDAO;
import course.project.dto.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This is our Service Class
@Service
public class CourseServiceIcpl implements ICourseService {
    List<Course> crsList = new ArrayList<>(Arrays.asList(
            new Course(1, "PHP", "Algorithms"), //This are Hard-Coded Values;
            new Course(2,"JAVA", "Objects"),
            new Course(3, "HTML", "Design")));

    @Autowired
    private ICourseDAO daoRef;

    @Override
    public List<Course> getAllCourse() {

    //    return crsList; //Here we return crsList.
        return daoRef.findAll();
    }

    @Override
    public Course getCourseById(int crsId) {
       //return crsList.stream().filter(c -> c.getCrsId() == crsId).findFirst().get(); //Here we return id using Lambda

        return daoRef.getOne(crsId);
    }

    @Override
    public void addCourse(Course course) {

        //crsList.add(course);
        daoRef.save(course);
    }

    @Override
    public void updateCourse(Course course, int crsId) {
//        for (int i=0; i<crsList.size(); i++){
//            Course c = crsList.get(i);
//            if (c.getCrsId()==crsId){
//                crsList.set(i, course);
//                return;
//            }
//        }
        daoRef.save(course);
    }

    @Override
    public void deleteCourse(int crsId) {

      //  crsList.removeIf(c -> c.getCrsId()== crsId);
        daoRef.deleteById(crsId);
    }
}
