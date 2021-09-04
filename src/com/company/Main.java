package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m=in.nextInt(), min=1001;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <m; i++) {
            list.add(in.nextInt());
        }

        Collections.sort(list);

        for (int i = 0; i <=m-n; i++) {
            if (list.get(i+n-1)-list.get(i)<min) min=list.get(i+n-1)-list.get(i);
        }

        System.out.println(min);
    }
}
