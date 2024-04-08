package com.example.designpaterns.InterpreterDesignPattern.Expressions;

public class SumNotTerminalExpression implements Interpreter{

    Interpreter leftExpression;
    Interpreter rightExpression;

    public SumNotTerminalExpression(Interpreter leftExpression,Interpreter rightExpression)
    {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
    }
    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);


    }
}

