package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription (){
        String resultString = "";
        String paw = "";
        String fur = "";
        if(numberOfPaws == 1){
            paw = "paw";
        }else{
            paw = "paws";
        }
        if(hasFur == true){
            fur = "a";
        }else{
            fur = "no";
        }
        resultString += "This animal is mostly "+ color+"."+"It has "+numberOfPaws+" "+paw+" and "+fur+" fur.";
        return resultString;
    }
}
