package com.example.entities;

public class Subject {
    private String name;
    private String description;
    private static Subject subject;

    public static Subject newBuilder(){
        subject = new Subject();
        return subject;
    }
    public  Subject build(){
        return subject;
    }

    public String getName() {
        return name;
    }

    public Subject setName(String name) {
        this.name = name;
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public Subject setDescription(String description) {
        this.description = description;
        return  subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
