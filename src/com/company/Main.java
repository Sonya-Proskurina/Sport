package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(), n = in.nextInt();
        int sum = t;
        while (t>=n){
            sum++;
            t-=n;
            t++;
        }
        System.out.println(sum);
    }
}
