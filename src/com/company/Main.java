package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        for (int i = 0; i <n; i++) {
            long a = in.nextLong(),k=0;
            for (int j = 1; j <=9; j++) {
                long ten=0;
                for (int l = 0; l <=9; l++) {
                    ten+= Math.pow(10,l);
                    if (ten*j<=a) {
                        k++;
                    }
                    else break;
                }
            }
            System.out.println(k);
        }
    }
}
