package com.company;

import java.util.Scanner;

public class ComputerWage {

    //declare variables
    private String name;
    private double gtotal;
    private int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGtotal() {
        return gtotal;
    }

    public void setGtotal(double gtotal) {
        this.gtotal = gtotal;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public void AcceptData (){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the name");
        boolean invalidInput = false;

        name = key.nextLine();

        while(!invalidInput){
            System.out.println("Enter the hours");
            String input = key.next();

            try{
                hours = Integer.parseInt(input);
                invalidInput = true;
            } catch (NumberFormatException e){
                System.out.println("You didn't enter a valid number");
            }

        }

    }

    public double ComputeWage(){

        if(this.hours > 40){

            this.gtotal = (40*15) + (16.5 * (this.hours-40));

        }else{
            this.gtotal = hours *15;
        }

        return this.gtotal;
    }


    public void Display(){

        System.out.println("The total wage of " + this.name + " is " + this.gtotal);

    }

}

