package com.example.designpaterns.ChainOfResponsibility;

public interface SetHandlerNext {

    public void SetNext(SetHandlerNext setHandlerNext);
    public void toDoTask(Request request);
}
