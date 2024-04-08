package com.example.machineCoding.TrueCaller.models.common;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class PersonalInfo {

    private String firstName;
    private String lastName;
    private String middleName;
    private String initials;
    private Date dob;
    private Gender gender;
    private Address address;
    private String companyName;
    private String title;

    public PersonalInfo(String firstName)
    {
        this.firstName=firstName;
    }




}
