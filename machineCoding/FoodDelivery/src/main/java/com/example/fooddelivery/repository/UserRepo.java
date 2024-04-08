package com.example.fooddelivery.repository;

import com.example.fooddelivery.model.User;

import java.util.HashMap;

public class UserRepo {


    HashMap<Integer, User> users=new HashMap<Integer, User>();

    public void addUser(User user)
    {
        users.put(user.getUser_id(),user);
    }

    public User getUser(int user_id)
    {
        return users.get(user_id);
    }
}
