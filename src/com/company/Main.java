package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long n= in.nextLong(), k=0;
        while (n>0){
            if (n%10==7||n%10==4) k++;
            n/=10;
        }
        if (k==7||k==4) System.out.println("YES");
        else System.out.println("NO");
    }
}
