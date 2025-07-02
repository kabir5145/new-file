//writing  a program to calculate the percentage of class 12 boards
package com.company;
import java.util.Scanner;

public class CBSE_percent {
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
        System.out.println("marks obtained in physics");
        float a =s.nextInt();
        System.out.println("marks obtained in maths");
        float b =s.nextInt();
        System.out.println("marks obtained in chemistry");
        float c =s.nextInt();
        System.out.println("marks obtained in english");
        float d =s.nextInt();
        System.out.println("marks obtained in physical education");
        float e=s.nextInt();
        float sum = a+b+c+d+e;
        float percentage=(sum/500f)*100;
        System.out.println("your percentage=" + percentage);
    }
    }