package com.example.designpaterns.InterpreterDesignPattern.Expressions;

public class MultiplyNonTerminalExpression implements Interpreter{

    Interpreter leftExpression;
    Interpreter rightExpression;

    public MultiplyNonTerminalExpression(Interpreter leftExpression,Interpreter rightExpression)
    {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
    }
    @Override
    public int interpret(Context context) {
      return leftExpression.interpret(context) * rightExpression.interpret(context);


    }
}
