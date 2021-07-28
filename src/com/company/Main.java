package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.next();
        for (int i = 0; i <s.length(); i++) {
            if (s.toCharArray()[i]=='H'||s.toCharArray()[i]=='Q'||s.toCharArray()[i]=='9') {
                System.out.println("YES");
                break;
            }
            else if (i==s.length()-1) System.out.println("NO");
        }
    }
}
