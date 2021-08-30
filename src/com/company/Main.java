package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();

        for (int i = 0; i <n ; i++) {
            int a=in.nextInt(), b = in.nextInt(), myMax = 0;
            if (b-a<b/2) {
                myMax = b-a;
            }
            else if (b%2==0) myMax = b/2-1;
            else  myMax = b/2;
            System.out.println(myMax);
        }
    }
}
