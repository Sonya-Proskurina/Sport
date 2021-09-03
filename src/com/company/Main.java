package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(in.nextInt());
        for (int i = 1; i < n; i++) {
            list.add(in.nextInt());
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j) > list.get(j + 1)) {
                    Integer r = list.get(j) - list.get(j + 1);
                    list.set(j, list.get(j) - r);
                    list.set(j + 1, list.get(j + 1) + r);
                }
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
