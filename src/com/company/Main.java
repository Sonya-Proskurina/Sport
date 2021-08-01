package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        int prise = (Math.min(b, m * a)*(n/m))+ Math.min((n%m)*a,b) ;
        System.out.println(prise);
    }
}
