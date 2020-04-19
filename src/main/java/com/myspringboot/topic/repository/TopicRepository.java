package com.myspringboot.topic.repository;

import com.myspringboot.topic.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {


}
