package com.myspringboot.course.topic.repository;

import com.myspringboot.course.topic.models.Course;
import com.myspringboot.course.topic.models.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface CourseRepository extends CrudRepository<Course, String> {


}
