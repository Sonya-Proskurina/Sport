package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.next();
        char[] arr= s.toCharArray();
        arr[0]='f';
        s=String.valueOf(arr);
        System.out.println(s);
    }
}
