package com.example.vendingmachine.model;


import com.example.vendingmachine.state.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {

    ItemSelf[] arr;
    State state;
    List<Coin> coins;
    public VendingMachine()
    {
        arr=new ItemSelf[9];
        state=new IdealState();
        coins=new ArrayList<>();

    }

}
