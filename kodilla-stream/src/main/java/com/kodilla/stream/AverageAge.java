package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args){
        double avg = UsersRepository.getUsersLists()//list<user>
                .stream()//stream<user>
                .map(u -> u.getAge())//stream<integer>
                .mapToInt(n ->n)//intStream
                .average()//optionalDouble
                .getAsDouble();
        System.out.println(avg);
    }
}