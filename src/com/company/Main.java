package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        Set<Character> mySet = new HashSet<>();

        for (int i = 0; i <s.length() ; i++) {
            mySet.add(s.toCharArray()[i]);
        }

        if (mySet.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
