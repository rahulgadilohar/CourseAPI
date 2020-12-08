package course.project.service;

import course.project.dto.Course;

import java.util.List;

//This is our Interface of Service.
public interface ICourseService {

    List<Course> getAllCourse();
    Course getCourseById(int crsId); //Here we define a function

    void addCourse(Course course);


    void updateCourse(Course course, int crsId);

    void deleteCourse(int crsId);
}
