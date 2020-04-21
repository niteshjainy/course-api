package com.myspringboot.course.topic.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String Description;
    @ManyToOne
    private Course course;




    public Topic(String id, String name, String description, String courseId) {
        this.id = id;
        this.name = name;
       this.Description = description;
       this.course = new Course(courseId, "","");

    }

    public Topic() {

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
