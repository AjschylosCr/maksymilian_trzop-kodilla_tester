package com.kodilla.stream.com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("enter number of rounds");
            String s = scanner.nextLine();
            try{
                int rounds = Integer.parseInt(s);
                return rounds;}
                catch (Exception e){
                    System.out.println("Wrong kind of data, enter only digits, try again");
                }
            }
        }
    }