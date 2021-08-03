package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = in.nextInt();
            int c2 = n/3, c1= n/3;
            if (n%3==1) ++c1;
            else if (n%3==2) c2++;
            System.out.println(c1+" "+c2);
        }
    }
}
