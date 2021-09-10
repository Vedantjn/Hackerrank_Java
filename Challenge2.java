package com.company;
import java.util.Scanner;
import java.util.Random;

public class Challenge2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor");
        int userinput=sc.nextInt;

        Random r=new Random();
        int computerinput = r.nextInt(bound 3); 

        if(userinput==computerinput){
            System.out.println("Draw");
        }
        else if(userinput==0 && computerinput==2 || userinput== 1 && computerinput== 0 || userinput==2 &&computerinput==1 ){
            System.out.println("You win!");
            
        }else{
            System.out.println("Computer wins!");
        }
        System.out.println("Computer's choice: "+ computerinput);


    }
}