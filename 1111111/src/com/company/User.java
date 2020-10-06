package com.company;

import java.time.LocalDateTime;

//clasa
public class User {
    private String lastname;
    private String firstname;
    private int age;
    private String email;
    private status status;
    private LocalDateTime timestamp;

    //constructor
    public User(String firstname, String lastname, int age, String email, status status, LocalDateTime localDateTime) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timestamp = localDateTime;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;

    }
    public int getage() {
        return age;
    }

    public String getEmail(){
        return email;
    }

    public status getstatus(){
        return status;

    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setStatus(status status){
        this.status = status;
    }

    public void setTimestamp(LocalDateTime dateTime){
        this.timestamp = dateTime;
    }

    @Override
    public String toString() {
        return String.format(firstname + " " + lastname + " " + age + " " + status);
    }
}

enum status {
    ACTIVE,
    INACTIVE,
    BLOCKED,
    NEW
}
