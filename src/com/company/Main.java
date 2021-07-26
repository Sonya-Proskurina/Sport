package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), t = in.nextInt();
        String s = in.next();
        for (int j = 0; j < t; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (s.toCharArray()[i] == 'B' && s.toCharArray()[i + 1] == 'G') {
                    char[] arr = s.toCharArray();
                    arr[i] = 'G';
                    arr[i + 1] = 'B';
                    s=String.valueOf(arr);
                    i++;
                }
            }
        }
        System.out.println(s);
    }
}
