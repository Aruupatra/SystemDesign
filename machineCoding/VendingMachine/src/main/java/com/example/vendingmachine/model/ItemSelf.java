package com.example.vendingmachine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemSelf {

    private Item item;
    private int selfNumber;
    private int quantity;
}
