package com.example.designpaterns.Builder;



public class client {

    public static  void main(String ar[]) throws GradYearException {

//       Student.Builder builder=Student.getBuilder();
//        builder.setAge(1);
//        builder.setName("Arun");
//        builder.setScore(10.0);
//        builder.setUniversity("SOA");
//        builder.setBatchName("AcademyMorning");
//
//        Student obj=builder.build();
//

        Student.Builder builder=Student.getBuilder();
        builder.setName("Arun").setAge(20).setBatchName("MorningAcademy").setScore(10.0).setUniversity("SOA");
        Student obj=builder.build();
        System.out.println("DEBUG");

    }
}
