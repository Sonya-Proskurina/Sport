package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =in.nextInt(),ost=1;
        for (int i = 0; i <n-1; i++) {
            int b =in.nextInt();
            if (b==10&&a==1||b==1&&a==10){
                ost++;
            }
            a=b;
        }
        System.out.println(ost);
    }
}
