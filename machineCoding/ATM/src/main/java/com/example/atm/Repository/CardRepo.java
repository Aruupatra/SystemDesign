package com.example.atm.Repository;

import com.example.atm.model.Account;
import com.example.atm.model.Card;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardRepo {

    private Map<Integer, Card> cardNumberCard=new HashMap<>();
    private List<Account> accounts;
    private Map<Integer,Integer> cardNumberAccount=new HashMap<>();
}
