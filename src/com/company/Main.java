package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt(),n;
        boolean f;
        for (int i = 0; i <t ; i++) {
            f=false;
            n=in.nextInt();
            for (int j = 0; j <500; j++) {
                for (int k = 0; k <500; k++) {
                    if ((j+k)*2020+k==n&&(j>0||k>0)){
                        f=true;
                        break;
                    }
                    else if ((j+k)*2020+k>n) break;
                }
                if (f) break;
            }
            if (f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
