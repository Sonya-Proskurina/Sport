package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] arr = new char[s.length()];
        boolean a=((int)s.toCharArray()[0]<=90),b=true,c=true;
        for (int i = 1; i <s.length(); i++) {
            if ((int)s.toCharArray()[i]<=90)
                b=false;
            else c = false;
        }
        if (a&&c||!a&&c) {
            for (int i = 0; i <s.length(); i++) {
                if ((int)s.toCharArray()[i]<=90) arr[i] = (char)((int)(s.toCharArray()[i])+32);
                else arr[i] = (char)((int)(s.toCharArray()[i])-32);
            }
            System.out.println(String.valueOf(arr));
        }
        else System.out.println(s);
    }
}
