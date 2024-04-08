package com.example.designpaterns.InterpreterDesignPattern.Expressions;

public class TerminalExpression implements Interpreter{

    String s;
    public TerminalExpression(String s)
    {
        this.s=s;
    }



    @Override
    public int interpret(Context context) {

        return context.get(s);

    }


}
