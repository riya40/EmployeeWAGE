package com.bridgelabz.demobasic;

public class EmpWage {

    public static void main(String[] args) {
        int Wph=20,wage,Fdh=8;
	// displaying the welcome Message
        System.out.println("Welcome To Employee Wage Computation");

        //checking the Employee Presence
        double rand = Math.floor(Math.random()*10)%2;
        if(rand==1){
            System.out.println("employee present");
            //calculating emp wage
            wage= Wph*Fdh;
            System.out.println("wage is:" +wage);
        }
        else{
            System.out.println("employee absent");
        }
    }
}
