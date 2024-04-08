package com.example.designpaterns.Factry.DbExample;

import java.util.Scanner;

public class Client {

    public static void main(String[] ar)
    {


          Scanner sc=new Scanner(System.in);
          Database db;

          String database=sc.nextLine();
        //Here it's violating OCP and SRP
        if(database.equals("MySQL"))
        {
              db=new MySQL();
        } else if (database.equals("PostGres")) {
              db=new PostGres();
        }
        else {
              db=new MongoDB();
        }

        db.createQuery();
        db.createTransaction();

    }
}
