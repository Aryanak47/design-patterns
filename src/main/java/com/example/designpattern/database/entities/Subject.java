package com.example.designpattern.database.entities;

public class Subject {
    private String name;
    private String description;
    public static SubjectBuilder subjectBuilder = new SubjectBuilder();


    public static SubjectBuilder newBuilder(){
        return subjectBuilder;

    }
    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
      public static class SubjectBuilder{
        private Subject subject = new Subject();
        public SubjectBuilder setName(String name){
            subject.name = name;
            return this;
        }
        public SubjectBuilder setDescription(String desc){
            subject.description = desc;
            return this;
        }
        public  Subject build(){
            return subject;
        }

    }
}
