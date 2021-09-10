package com.company;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter marks of Subject 1");
        int a=sc.nextInt();
        System.out.println("Enter marks of Subject 2");
        int b=sc.nextInt();
        System.out.println("Enter marks of Subject 3");
        int c=sc.nextInt();
        System.out.println("Enter marks of Subject 4");
        int d=sc.nextInt();
        System.out.println("Enter marks of Subject 5");
        int e=sc.nextInt();

        int Result=(a+b+c+d+e)/5;

        System.out.println("The result is "+ Result);
    }
}