package com.myspringboot.course.topic.controllers;
import com.myspringboot.course.topic.models.Course;
import com.myspringboot.course.topic.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseservice;

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
         return courseservice.getAllCourses();
    }

    @RequestMapping("/courses/{courseId}")
    public Optional<Course> getCourse(@PathVariable String courseId){
        return courseservice.getCourse(courseId);
    }

    @PostMapping("/courses" )
    public void addCourse(@RequestBody Course course){
        courseservice.addCourse(course);
    }

    @PutMapping("/courses/{courseId}")
    public void updateCourse(@RequestBody Course course){
        courseservice.addCourse(course);
    }

  @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId){
      courseservice.deleteCourse(courseId);
    }

}
