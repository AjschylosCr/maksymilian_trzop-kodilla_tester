package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUsersLists()//List<User>
                .stream() //Stream<User>
                .filter(u -> u.getGroup().equals("Chemists")) //Stream<User>
                .map(UsersManager::getUserName) //Stream<String>
                .collect(Collectors.toList());
                System.out.println(usernames);
    }
    public static String getUserName(User user){
        return user.getUsername();
    }
}
