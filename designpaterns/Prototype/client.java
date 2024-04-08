package com.example.designpaterns.Prototype;

public class client {



    public static void fillRegistry(Register sregister,Register iqregister)
    {

        Student studenttemplate=new Student();
        studenttemplate.setUniverSity("SOA");
        studenttemplate.setBatchName("AcademyMorning");
        studenttemplate.setAvgpsp(10.0);

        sregister.addTemplate("AcademyMorning",studenttemplate);

        InteligentStudent iqtemplate=new InteligentStudent();
        iqtemplate.setIQ(10);
        iqtemplate.setName("Hari");
        iqtemplate.setAvgpsp(5);
        iqtemplate.setUniverSity("KIIT");
        iqtemplate.setBatchName("IQEvening");

        iqregister.addTemplate("IQEvening",iqtemplate);


    }
    public static void main(String[] ar)
    {


    Register<String,Student> Studentregister=new Register();
    Register<String,InteligentStudent> InteligetntStudentregister=new Register();
    fillRegistry(Studentregister,InteligetntStudentregister);

    Student s1=Studentregister.getTemplate("AcademyMorning").copy();

    Student is1= InteligetntStudentregister.getTemplate("IQEvening").copy();



       System.out.println("DEBUG");
    }
}































//
//
//
//
//
//
//
//
//
//
//
//
//Register register=new Register();
//Student studenttemplate=new Student();
//        studenttemplate.setUniverSity("SOA");
//        studenttemplate.setBatchName("AcademyMorning");
//        studenttemplate.setAvgpsp(10.0);
//
//        register.addTemplate("AcademyMorning",studenttemplate);
//
//Student student1=studenttemplate.copy();
//        student1.setName("Arun");
//        student1.setAge(10);
//
//Student student2=studenttemplate.copy();
//        student2.setName("Bapun");
//        student2.setAge(9);
//
//InteligentStudent iqtemplate=new InteligentStudent();
//        iqtemplate.setIQ(10);
//        iqtemplate.setName("Hari");
//        iqtemplate.setAvgpsp(5);
//        iqtemplate.setUniverSity("KIIT");
//        iqtemplate.setBatchName("Evening");
//
//InteligentStudent iqstudent1=iqtemplate.copy();
//        iqstudent1.setIQ(10);
//
//        register.addTemplate("EveningStudent",iqtemplate);
//
////  InteligentStudent iqstudent2=register.getTemplate("EveningStudent").copy();
