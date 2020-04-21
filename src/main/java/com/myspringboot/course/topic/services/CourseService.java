package com.myspringboot.course.topic.services;

import com.myspringboot.course.topic.models.Course;
import com.myspringboot.course.topic.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courserepository;

    public List<Course> getAllCourses(){

        List<Course> courses =new ArrayList<>();
        courserepository.findAll().forEach(courses::add);
        return courses;

    }

    public Optional<Course> getCourse(String courseId) {
        return courserepository.findById(courseId);
    }

    public void addCourse(Course course){
        courserepository.save(course);
    }


    public void deleteCourse(String courseId) {
        courserepository.deleteById(courseId);
       }
}
