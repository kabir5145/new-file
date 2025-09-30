package com.company;

public class logic {
    public static void main(String[] args) {
        int n = 5;
        int b = 5;
        int c = 1;

        for(int i = 0;i<n;i++) {
            for (int k = 0; k <c+i; k++) {
                System.out.print(" ");
            }
            for(int d = 0;d<n;d++) {
                System.out.print("+");
            }
            for(int d = 0;d<c;d++) {
                System.out.print(" ");
            }
            for(int d = 0;d<n;d++) {
                System.out.print("k");
            }
            System.out.println();
        }
    }
}
