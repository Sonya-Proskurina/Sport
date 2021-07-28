package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long n= in.nextLong(), m=in.nextLong(),a = in.nextLong();
        n = (n%a==0)? n/a: n/a+1;
        m = (m%a==0)? m/a: m/a+1;
        System.out.println(n*m);
    }
}
