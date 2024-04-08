package com.example.designpaterns.ChainOfResponsibility;

public class AdavanceLevelSupport implements SetHandlerNext{


    @Override
    public void SetNext(SetHandlerNext setHandlerNext) {


    }

    @Override
    public void toDoTask(Request request) {

        if(request.getSupportedPlatForm().equals(SupportedPlatForm.ADVANCE))
        {
            System.out.println("Handeled by ADVANCE level Support");
        }
        else
        {
            System.out.println("Request can not handel");
        }

    }
}
