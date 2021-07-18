package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt(), money=in.nextInt(), n=in.nextInt();
        int dolg=(k*(1+n)*n/2-money>0)?k*(1+n)*n/2-money:0;
        System.out.println(dolg);
    }
}
