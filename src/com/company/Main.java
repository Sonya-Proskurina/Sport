package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s= in.nextInt(), n= in.nextInt();
        int k=0;
        boolean live = true;
        TreeMap<Integer,Integer> arr =new TreeMap<>();
        for (int i = 0; i <n; i++) {
            int x=in.nextInt(), y=in.nextInt();
            if (arr.containsKey(x)) {
                arr.replace(x,y+arr.get(x));
                k++;
            }
            else arr.put(x,y);
        }
        Vector<Integer> vector =new Vector(arr.keySet());
        Vector<Integer> vector2 =new Vector(arr.values());
        for (int i = 0; i <n-k; i++) {
            if (s>vector.get(i)) s+=vector2.get(i);
            else {
                live=false;
                break;
            }
        }
        if (live) System.out.println("YES");
        else System.out.println("NO");
    }
}
