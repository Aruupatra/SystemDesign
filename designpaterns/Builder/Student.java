package com.example.designpaterns.Builder;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Student {

    private String name;
    private int age;
    private String university;
    private String batchName;
    private double score;

    private Student(Builder builder)
    {
        this.name=builder.getName();
        this.batchName=builder.getBatchName();
        this.age= builder.getAge();
        this.score=builder.getScore();
        this.university=builder.getUniversity();

    }
    public static Builder getBuilder() {
        return new Builder();
    }

    public  static Student getStudent(Builder builder)
    {
        Student student=new Student(builder);
        return student;
    }

     static class Builder {

        private String name;
        private int age;
        private String university;
        private String batchName;
        private double score;

        public Student build() throws GradYearException {
            if (this.getAge() > 2022) {
                throw new GradYearException("Grad Year can't be greater than 2022");
            }
            Student student=Student.getStudent(this);
            return student;
        }

        public Builder setName(String name)
        {
             this.name=name;
            return this;
        }
        public String getName()
        {
            return this.name;
        }

        public Builder setUniversity(String university)
        {
            this.university=university;
            return this;
        }
        public String getUniversity()
        {
            return this.university;
        }

        public Builder setBatchName(String batchName)
        {
            this.batchName=batchName;
            return this;
        }
        public String getBatchName()
        {
            return this.batchName;
        }
        public Builder setAge(int age)
        {
            this.age=age;
            return this;
        }
        public  int getAge()
        {
            return this.age;
        }

        public Builder setScore(double score)
        {
            this.score=score;
            return this;
        }
        public double getScore()
        {
            return this.score;
        }
    }

}
