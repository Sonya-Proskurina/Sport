package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            long ostatok, k = 0;
            long n = in.nextLong();
            if (n < 2050 || n % 2050 != 0) System.out.println(-1);
            else {
                ostatok = n / 2050;
                while (ostatok > 0) {
                    k += ostatok % 10;
                    ostatok /= 10;
                }
                System.out.println(k);
            }
        }
    }
}
