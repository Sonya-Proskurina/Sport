package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i <t; i++) {
            long n =in.nextLong(),k=0;
            for (long j = n/2,x=0; j >0; j--,x+=2) {
                k+=((n-x)*4-4)*j;
            }
            System.out.println(k);
        }
    }
}
