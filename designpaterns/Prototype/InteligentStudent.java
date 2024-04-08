package com.example.designpaterns.Prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class InteligentStudent extends Student{

    private int IQ;
    public InteligentStudent()
    {

    }

    public InteligentStudent(InteligentStudent iqstudent)
    {
        super(iqstudent);
        this.setIQ(iqstudent.getIQ());
    }
    public InteligentStudent copy()
    {
        InteligentStudent iqstudent=new InteligentStudent(this);
      // iqstudent.IQ=this.getIQ();
//        iqstudent.setAvgpsp(this.getAvgpsp());
//        iqstudent.setName(this.getName());
//        iqstudent.setUniverSity(this.getUniverSity());
//        iqstudent.setBatchName(this.getBatchName());
//        iqstudent.setAge(this.getAge());

        return iqstudent;

    }
}
