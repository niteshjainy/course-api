package com.myspringboot.course.topic.repository;

import com.myspringboot.course.topic.models.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, String> {
    List<Topic> findByCourseCourseId(String courseId);
}
