package com.example.designpaterns.InterpreterDesignPattern;

import com.example.designpaterns.InterpreterDesignPattern.Expressions.*;

public class client {

    public static void main(String[] ar)
    {
        Context context=new Context();
        context.put("a",10);
        context.put("b",20);
        context.put("c",30);
        context.put("d",40);
        Interpreter expression=new SumNotTerminalExpression(new MultiplyNonTerminalExpression(new TerminalExpression("a"),new TerminalExpression("b")),
                                                            new MultiplyNonTerminalExpression(new TerminalExpression("c"),new TerminalExpression("d")));
       System.out.println( expression.interpret(context));
    }
}
