package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), z=in.nextInt();
        int s=n;
        for (int i = 0; i <n; i++) {
            int a =in.nextInt();
            if (a>z) s++;
        }
        System.out.println(s);
    }
}
