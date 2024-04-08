package com.example.designpaterns.Prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private String name;
    private int age;
    private String UniverSity;
    private String BatchName;
    private double avgpsp;
    public Student()
    {

    }
    public Student(Student student)
    {


        this.setAvgpsp(student.getAvgpsp());
        this.setUniverSity(student.getUniverSity());
        this.setBatchName(student.getBatchName());
    }

    public Student copy()
    {
        Student student=new Student(this);

        return student;

    }


}
