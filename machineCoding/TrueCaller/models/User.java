package com.example.machineCoding.TrueCaller.models;

import com.example.machineCoding.TrueCaller.models.common.UserType;

public class User extends Account{
    @Override
    public void register(UserType userType, String userName, String password, String email, String phoneNumber, String countryCode, String firstName) {

    }

    @Override
    public void addConcat(User user) throws ContactsExceededException {

    }

    @Override
    public void removeContact(String number) throws ContactDoesNotExistsException {

    }

    @Override
    public void blockNumber(String number) throws BlockLimitExceededException {

    }

    @Override
    public void unblockNumber(String number) {

    }

    @Override
    public void reportSpam(String number, String reason) {

    }

    @Override
    public void upgrade(UserType userType) {

    }

    @Override
    public boolean isBlocked(String number) {
        return false;
    }

    @Override
    public boolean canReceive(String number) {
        return false;
    }

    @Override
    public boolean importContacts(List<User> users) {
        return false;
    }
}
