package com.company;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.next();
        char[] arr= new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            if ((int)s.toCharArray()[i]<=90&&i!=0) arr[i] = (char) ((int)s.toCharArray()[i]+32);
            else if ((int)s.toCharArray()[i]>90&&i==0) arr[i] = (char) ((int)s.toCharArray()[i]-32);
            else if ((int)s.toCharArray()[i]<=90&&i==0||(int)s.toCharArray()[i]>90&&i>0) arr[i] = (char) ((int)s.toCharArray()[i]);
        }
        System.out.println(String.valueOf(arr));
    }
}
