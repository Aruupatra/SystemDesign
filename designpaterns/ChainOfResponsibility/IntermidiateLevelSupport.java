package com.example.designpaterns.ChainOfResponsibility;

public class IntermidiateLevelSupport implements SetHandlerNext{
    SetHandlerNext setHandlerNext;
    @Override
    public void SetNext(SetHandlerNext setHandlerNext) {
        this.setHandlerNext=setHandlerNext;
    }

    @Override
    public void toDoTask(Request request) {

        if(request.getSupportedPlatForm().equals(SupportedPlatForm.INTERMIDIATE))
        {
            System.out.println("Handeled by INTERMIDIATE level Support");
        }
        else if(setHandlerNext!=null)
        {
            setHandlerNext.toDoTask(request);
        }

    }
}
