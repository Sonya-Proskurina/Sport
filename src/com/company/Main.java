package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt(), x = 1, k = 2;
            for (int j = 2; j <30; j++) {
                if (n%(Math.pow(2, j)-1)==0) {
                    x =n/(int)(Math.pow(2, j)-1);
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
