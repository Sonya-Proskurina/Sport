package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 0) System.out.println(n);
        else if ((n % 10 < (n / 10) % 10)) System.out.println(n / 10);
        else if (n<=-10){
            System.out.println((n / 100) * 10 + (n % 10));
        }
        else System.out.println(0);
    }
}
