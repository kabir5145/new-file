package com.company;
import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the symbol to do the calculation like (+,-,*,/):");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        double result1 = 0;

        switch (operator){
            case '+':
                result1 = num1+ num2;
                break;

            case '-':
                result1 = num1 - num2;
                break;
            case '*':
                result1 = num1*num2;
                break;
            case '/':
                if(num2 !=0){
                   result1 = num1/num2;
                }else {
                    System.out.println("There is an error!");
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result:"+ result1);
        sc.close();
    }
}
