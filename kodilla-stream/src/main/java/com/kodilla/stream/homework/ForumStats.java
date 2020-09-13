package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersLists()//list<user>
                .stream()//stream<user>
                .filter(u -> u.getAge() >= 40)//
                .map(u -> u.getNumberOfPosts())//stream<integer>
                .mapToInt(n ->n)//intStream
                .average()//optionalDouble
                .getAsDouble();
        System.out.println(avg);
    }
}
