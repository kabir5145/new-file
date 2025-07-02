package com.util.company;

import java.util.Scanner;

public class for_revision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );
        /*
        System.out.println("the numbers of maths are");
        double  a =sc.nextInt();
        System.out.println("the numbers of physics are ");
        double b =sc.nextInt();
        System.out.println("the numbers obtained in chemistry are");
        double c =sc.nextInt();
        System.out.println(" percentage obtained is");
        double v = ((a + b + c) / 300) * 100;
        System.out.println(v);
         */
        /*
        System.out.println("Enter your name please!");
        String  a = sc.next();
        System.out.println("Hello ! "+a+" have a good day");
         */
        /*
        System.out.println("Enter the distance in kilometers:");
        double a = sc.nextDouble();
        double b= a*0.621371;
        System.out.println("kilometers = "+b+" miles");
         */
        System.out.println("Enter the number");
        if(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("you entered an integer : "+num);
        }else {
            String in = sc.next();
            System.out.println("Not an integer .you entered : "+in);
        }
        sc.close();
    }
}
