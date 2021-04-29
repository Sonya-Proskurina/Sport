package com.company;

import java.util.*;

public class Main {
    static boolean antiSqrt(int n) {
        boolean b = true;
        for (int i = 0; i <= n / 2; i++) {
            if (i * i == n) b = false;
        }
        if (n == 1) b = false;
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(), n, k;
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            k = 0;
            for (int j = 0; j < n; j++) {
                if (antiSqrt(in.nextInt())) {
                    k++;
                }
            }
            if (k == 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
