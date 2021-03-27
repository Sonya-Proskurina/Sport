package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = 1;
        boolean b = false;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (arr[i] == arr[i + 1]) n++;
            else {
                if (n >= 7) {
                    b = true;
                    break;
                }
                n = 1;

            }
        }
        if (b || n >= 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
