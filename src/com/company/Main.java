package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), t = n * m;
        boolean Akshat = true;
        while (t >0) {
            int k = (n > 0 && m > 0) ? 1 : 0;
            t -= (n+m-k);
            m--;
            n--;
            if (t!=0)
            Akshat=!Akshat;
        }
        if (Akshat) System.out.println("Akshat");
        else System.out.println("Malvika");
    }
}
