package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        for (int i = 0; i <t ; i++) {
            String s=in.next();
            int n=0,one=0;
            Map<Character,Integer> map = new HashMap<>();
            for (int j = 0; j <s.length(); j++) {
                if (map.get(s.toCharArray()[j])==null) map.put(s.toCharArray()[j],1);
                else {
                    map.replace(s.toCharArray()[j],map.get(s.toCharArray()[j])+1);
                }
            }
            for (Integer v : map.values()) {
                if (v==1) one++;
                else if (v>3) {
                    n++;
                }
                else n+=v/2;
            }
            System.out.println(n+one/2);
        }
    }
}
