package com.example.designpaterns.ChainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {

    SupportedPlatForm supportedPlatForm;
    public Request(SupportedPlatForm supportedPlatForm)
    {
        this.supportedPlatForm=supportedPlatForm;
    }
}
