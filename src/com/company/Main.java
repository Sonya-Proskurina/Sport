package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Прошла проверку
        int t = in.nextInt();
        for (int i = 0; i <t; i++) {
            long a = in.nextLong(), b = in.nextLong(), k;
            if (b<a) k = b;
            else {
                k = b+ b/(a-1);
                if (k%a==0) k--;
            }
            System.out.println(k);
        }
    }
}
