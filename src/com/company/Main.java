package com.company;

import java.util.*;

public class Main {
    private static String s;
    private static  Map<Character,Integer> arr = new HashMap<>();;
    private static void clear(int k){
        if (s.toCharArray()[k]=='R') {
            arr.put('R',1);
            arr.put('G',0);
            arr.put('B',0);
        }
        if (s.toCharArray()[k]=='G') {
            arr.put('R',0);
            arr.put('G',1);
            arr.put('B',0);
        }
        if (s.toCharArray()[k]=='B') {
            arr.put('R',0);
            arr.put('G',0);
            arr.put('B',1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l=in.nextInt();
        s = in.next();
        int n=0;
        //0-R, 1-G, 2-B
        clear(0);
        for (int i = 1; i <l; i++) {
            if (arr.get(s.toCharArray()[i])==0){
                clear(i);
            }
            else n++;
        }
        System.out.println(n);
    }
}
