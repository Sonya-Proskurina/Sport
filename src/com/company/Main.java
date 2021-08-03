package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1= in.next(), s2=in.next();
        boolean b= s1.length()==s2.length();
        for (int i = 0; i <s1.length(); i++) {
            if (s1.toCharArray()[i]!=s2.toCharArray()[s2.length()-i-1]) {
                b =false;
            }
            if (!b) break;
        }
        if (b) System.out.println("YES");
        else System.out.println("NO");
    }
}
