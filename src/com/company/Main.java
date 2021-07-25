package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a=in.nextInt(), b=in.nextInt();
        int n=1;
        while (Math.pow(1.5,n)<=b/a){
            n++;
        }
        System.out.println(n);
    }
}
