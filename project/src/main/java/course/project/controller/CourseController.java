package course.project.controller;

import course.project.dto.Course;
import course.project.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @Autowired //it checks internally mapping.
    ICourseService crsServiceRef; //Here we calling Interface.

    @RequestMapping("/welcome")
    public String WelcomeCourse(){
        return "This is Courses";
    }
//This will return all Courses
    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return crsServiceRef.getAllCourse(); //Here we calling Function
    }
//This will return ById.
    @RequestMapping("/courses/{crsId}")
    public Course getCourseById(@PathVariable int crsId){
        return crsServiceRef.getCourseById(crsId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addCourse(@RequestBody Course course){
        crsServiceRef.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{crsId}")
    public void updateCourse(@RequestBody Course course, @PathVariable int crsId){
        crsServiceRef.updateCourse(course, crsId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{crsId}")
    public void deleteCourse(@PathVariable int crsId){
        crsServiceRef.deleteCourse(crsId);
    }
}
