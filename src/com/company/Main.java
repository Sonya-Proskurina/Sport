package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(),n=0,k=0;
        for (int i = 0; i <t; i++) {
            n = n -in.nextInt() + in.nextInt();
            if (n>k) k=n;
        }
        System.out.println(k);
    }
}
