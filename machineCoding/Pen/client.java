package com.example.machineCoding.Pen;

import com.example.machineCoding.Pen.BallPens.type1BallPen;

public class client {

    public static void main(String ar[])
    {
        Refil refil=new Refil();
        type1BallPen pen=new type1BallPen("classic","Apsara",100,refil);
        pen.open();
        pen.refil();

    }
}

