package com.company;

public class Phone {
    private int ram;
    private int weight;
    private int size;
    private int phoneNumber;

    private String callSomeone(int number){
        return "You called " + number;
    }

    private String textSomeone(int number){
        return "You texted " + number;
    }

    private String playSnake(){
        return "You played Snake.";
    }
}
