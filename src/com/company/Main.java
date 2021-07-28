package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long n= in.nextLong(), m=in.nextLong();
        long k=0, me=1;
        for (int i = 0; i <m; i++) {
            long a =in.nextLong();
            if (a>=me) {
                k+=(a-me);
            }
            else {
                k+=(n-me+a);
            }
            me=a;
        }
        System.out.println(k);
    }
}
