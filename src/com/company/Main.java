package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if ((int)s.toCharArray()[0]>=97) {
            System.out.print((char)(((int)s.toCharArray()[0])-32));
            for (int i = 1; i <s.toCharArray().length; i++) {
                System.out.print(s.toCharArray()[i]);
            }
        }
        else {
            for (int i = 0; i <s.toCharArray().length; i++) {
                System.out.print(s.toCharArray()[i]);
            }
        }
    }
}
