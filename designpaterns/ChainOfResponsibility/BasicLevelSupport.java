package com.example.designpaterns.ChainOfResponsibility;



public class BasicLevelSupport implements SetHandlerNext{
    SetHandlerNext setHandlerNext;
    @Override
    public void SetNext(SetHandlerNext setHandlerNext) {

        this.setHandlerNext=setHandlerNext;

    }

    @Override
    public void toDoTask(Request request) {

        if(request.getSupportedPlatForm().equals(SupportedPlatForm.BASIC))
        {
            System.out.println("Handeled by BASIC level Support");
        }
        else if(setHandlerNext!=null)
        {
            setHandlerNext.toDoTask(request);
        }
    }
}
