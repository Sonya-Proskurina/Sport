package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeMap<Integer,Integer> arr = new TreeMap<>();
        for (int i = 0; i <n; i++) {
            arr.put(in.nextInt(),i+1);
        }
        for (int i = 1; i <=n; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
