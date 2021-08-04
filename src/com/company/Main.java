package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(),k = in.nextLong();
        long d = (n%2==0)?n/2:n/2+1;
        if (k<=d) System.out.println(k*2-1);
        else System.out.println((k-d)*2);
    }
}
