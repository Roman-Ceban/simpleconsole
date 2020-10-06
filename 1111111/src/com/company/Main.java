package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        User user1 = new User("Roman", "Ceban", 25, "Roma00952011@mail.ru", status.ACTIVE, LocalDateTime.now());
        User user2 = new User("Elena", "Ceban", 22, "Roma00952011@mail.ru", status.NEW, LocalDateTime.parse("2019-11-09 10:30", formatter));
        User user3 = new User("Mxim", "Negru", 23, "Roma00952011@mail.ru", status.INACTIVE, LocalDateTime.now());
        User user4 = new User("Valeriu", "Albu", 28, "Roma00952011@mail.ru", status.NEW, LocalDateTime.parse("2020-10-01 11:30", formatter));
        User user5 = new User("Dorina", "Verde", 26, "Roma00952011@mail.ru", status.ACTIVE, LocalDateTime.now());

        ArrayList<User> usersList = new ArrayList<User>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);

        listUsers(usersList);

        //activateUsersOlderThanYesterday(usersList);
        activateUsersOlderThanOneMonth(usersList);
        listUsers(usersList);


    }
    private static void activateUsersOlderThanOneMonth(ArrayList<User> users){
        LocalDateTime oneMonthAgo = LocalDateTime.now().minusMonths(1);
        for (User user : users) {
            if (user.getstatus() == status.NEW && user.getTimestamp().isBefore(oneMonthAgo)){
                user.setStatus(status.BLOCKED);
            }
        }
    }

    private static void activateUsersOlderThanYesterday(ArrayList<User> users) {
       LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
        for (User user : users) {
           if (user.getstatus() == status.NEW && user.getTimestamp().isBefore(yesterday)){
                user.setStatus(status.ACTIVE);
            }
        }
    }

    private static void listUsers(ArrayList<User> users) {
        System.out.println("-----------");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
