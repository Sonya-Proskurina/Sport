package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),a=0,d=0;
        String s = in.next();

        for (int i = 0; i <s.length()/2; i++) {
            if (s.toCharArray()[i]=='A') a++;
            else d++;
            if (s.toCharArray()[s.length()-1-i]=='A') a++;
            else d++;
            if (a>n/2+1||d>n/2+1) break;
        }

        if (n-a<a) System.out.println("Anton");
        else if (n-a>a) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
