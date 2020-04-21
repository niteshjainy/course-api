package com.myspringboot.course.topic.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private String courseId;
    private String name;
    private String Description;


    public Course(){}

    public Course(String courseId, String name, String description) {
        this.courseId = courseId;
        this.name = name;
        Description = description;
    }

    public String getCourseId() {
        return courseId;
    }


    public void setCourseId(String courseId) {
        this.courseId = courseId;
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
