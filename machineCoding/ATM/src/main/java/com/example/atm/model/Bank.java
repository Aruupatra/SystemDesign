package com.example.atm.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Bank {

    private int bank_id;
    private String name;
   private List<Account> accounts;

}
