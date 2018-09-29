package com.dark.knight.entity;

public class MailAccount extends User {

    private String emailAdresse;
    private String smtp;

    public MailAccount(String userName, String password) {
        super(userName, password);
    }
}
