package com.example.machineCoding.TrueCaller.models.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {

    private String countryCode;
    private String phone;
    private String email;

    public Contact(String countryCode,String phone,String email)
    {
        this.countryCode=countryCode;
        this.phone=phone;
        this.email=email;
    }
}
