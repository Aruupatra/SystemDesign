package com.example.machineCoding.TrueCaller.models;

import com.example.machineCoding.TrueCaller.models.common.*;
import lombok.Getter;
import lombok.Setter;


import java.sql.Time;
import java.util.Set;

@Getter
@Setter

public abstract class Account {

    private String id;
    private String phoneNumber;
    private String userName;
    private String password;
    private Time lastAccessed;
    private Tag tag;
    private Contact contact;
    private PersonalInfo personalInfo;
    private SocialInfo socialInfo;
    private Business business;
    private UserType userType;
    private Map<String,User> contacts;
   // private CountingBloomFilter<String> blockedContacts;
   private CountingBloomFilter<String> blockedContacts;
   private Set<String> blockedSet;
   private ContactTrie contactTrie;

   public Account()
   {

   }

   public Account(String phoneNumber,String firstName)
   {
       this.phoneNumber=phoneNumber;
          this.personalInfo=new PersonalInfo(firstName);
   }
   public Account(String phoneNumber,String firstName,String lastName)
   {
     this(phoneNumber,firstName);
     this.personalInfo.setLastName(lastName);
   }

    public abstract void register(UserType userType, String userName, String password,
                                  String email, String phoneNumber, String countryCode,
                                  String firstName);
    public abstract void addConcat(User user) throws ContactsExceededException;
    public abstract void removeContact(String number) throws ContactDoesNotExistsException;
    public abstract void blockNumber(String number) throws BlockLimitExceededException;
    public abstract void unblockNumber(String number);
    public abstract void reportSpam(String number, String reason);
    public abstract void upgrade(UserType userType);
    public abstract boolean isBlocked(String number);
    public abstract boolean canReceive(String number);

    public abstract boolean importContacts(List<User> users);


}
