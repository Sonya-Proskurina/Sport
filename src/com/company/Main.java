package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for (int i = 0; i <t ; i++) {
            long n = in.nextLong();
            int k = 0;
            while (n % 3 == 0) {
                if (n % 6 == 0) n /= 6;
                else n *= 2;
                k++;
            }
            if (n == 1) System.out.println(k);
            else System.out.println(-1);
        }
    }
}
