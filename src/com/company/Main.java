package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), l = in.nextInt();
        Set<Integer> set = new LinkedHashSet<>();
        double myMax=0, totalMax=0;
        for (int i = 0; i <n; i++) {
            set.add(in.nextInt());
        }
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        totalMax = (arrayList.get(0)>l-arrayList.get(arrayList.size()-1))?arrayList.get(0):l-arrayList.get(arrayList.size()-1);
        for (int i = 1; i <arrayList.size(); i++) {
            totalMax = Math.max((arrayList.get(i) - arrayList.get(i - 1))/2., totalMax);
        }
        System.out.printf("%.9f",totalMax/1.);
    }
}
