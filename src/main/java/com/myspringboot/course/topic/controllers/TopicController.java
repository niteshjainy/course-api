package com.myspringboot.course.topic.controllers;

import com.myspringboot.course.topic.models.Course;
import com.myspringboot.course.topic.models.Topic;
import com.myspringboot.course.topic.repository.TopicRepository;
import com.myspringboot.course.topic.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses/{courseId}")
public class TopicController {

    @Autowired
    private TopicService topicservice;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(@PathVariable String courseId) {
         return topicservice.getAllTopics(courseId);
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicservice.getTopic(id);
    }

    @PostMapping("/topics" )
    public void addTopic(@RequestBody Topic topic, @PathVariable String courseId){
        topic.setCourse(new Course(courseId,"",""));
        topicservice.addTopic(topic);
    }

    @PutMapping("topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String courseId){
        topic.setCourse(new Course(courseId,"",""));
         topicservice.addTopic(topic);
    }

  @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
       topicservice.deleteTopic(id);
    }

}
