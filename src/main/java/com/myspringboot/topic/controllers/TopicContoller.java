package com.myspringboot.topic.controllers;

import com.myspringboot.topic.models.Topic;
import com.myspringboot.topic.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicContoller {

    @Autowired
    private TopicService topicservice;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
         return topicservice.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicservice.getTopic(id);
    }

    @PostMapping("/topics" )
    public void addTopic(@RequestBody Topic topic){
     topicservice.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic){
         topicservice.addTopic(topic);
    }

  @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
       topicservice.deleteTopic(id);
    }

}
