package com.company;

public class Computer {
    private int ram;
    private String applications;
    private int weight;
    private int size;


    private int calculator(int number1, int number2){
        return number1 + number2;
    }

    private String runApplication(String name){
        return "You ran " + name;
    }

    private String accessInternet(){
        return "Welcome to AOL.";
    }
}
