package com.company;


public  class recursion {
    static int factorial1(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n*factorial1(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            int p = 1;
            for(int i =1;i<=n;i++){
                p *= 1;
            }
            return p;
        }
    }
    public static void main(String[] args) {
        int o =4;
        System.out.println(factorial1(o));
        System.out.println(factorial_iterative(o));
    }
}
