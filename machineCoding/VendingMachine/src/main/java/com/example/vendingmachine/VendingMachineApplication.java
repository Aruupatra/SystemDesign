package com.example.vendingmachine;

import com.example.vendingmachine.model.Coin;
import com.example.vendingmachine.model.Item;
import com.example.vendingmachine.model.ItemSelf;
import com.example.vendingmachine.model.VendingMachine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class VendingMachineApplication {

    public static void main(String[] args) {

        //SpringApplication.run(VendingMachineApplication.class, args);

        VendingMachine vendingMachine=new VendingMachine();

        fillallItem(vendingMachine);

        try{

            System.out.println("Hey If you want to Buy Please Click ON insertButton");
            vendingMachine.getState().insertButton(vendingMachine);
            List<Coin> temp=new ArrayList<>();
            temp.add(new Coin(10));
            vendingMachine.getState().insertCash(vendingMachine,temp);
            vendingMachine.getState().selectProductButtoon(vendingMachine,1,2);



        }
        catch (Exception exception)
        {
            exception.printStackTrace();

        }

    }

    public static void fillallItem(VendingMachine vendingMachine)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<vendingMachine.getArr().length;i++)
        {
            String itemName=sc.nextLine();
            int price=sc.nextInt();
            int quantity=sc.nextInt();
            vendingMachine.getArr()[i]=new ItemSelf(new Item(itemName,price),quantity,i);
        }
    }

}
