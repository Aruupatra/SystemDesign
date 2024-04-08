package com.example.designpaterns.ChainOfResponsibility;

public class Client {

    public static void main(String ar[])
    {
        Request request=new Request(SupportedPlatForm.ADVANCE);

        SetHandlerNext basicLevelSupport=new BasicLevelSupport();
        SetHandlerNext intermidiateLevelSupport=new IntermidiateLevelSupport();
        SetHandlerNext advanceLevelSupport=new AdavanceLevelSupport();

        basicLevelSupport.SetNext(intermidiateLevelSupport);
        intermidiateLevelSupport.SetNext(advanceLevelSupport);

        basicLevelSupport.toDoTask(request);


    }
}
