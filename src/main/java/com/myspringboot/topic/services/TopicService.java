package com.myspringboot.topic.services;

import com.myspringboot.topic.models.Topic;
import com.myspringboot.topic.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private  TopicRepository topicrepository;

    public List<Topic> getAllTopics(){

        List<Topic> topics =new ArrayList<>();
        topicrepository.findAll().forEach(topics::add);
        return topics;

    }

    public Optional<Topic> getTopic(String id) {
        return topicrepository.findById(id);
    }

    public void addTopic(Topic topic){
        topicrepository.save(topic);
    }


    public void deleteTopic(String id) {
       topicrepository.deleteById(id);
       }
}
