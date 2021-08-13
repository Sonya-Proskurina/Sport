package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <n; i++) {
            int len= in.nextInt(), k=in.nextInt();
            int shet=0,neshet=0;
            int[] arr = new int[len];
            for (int j = 0; j <len; j++) {
                arr[j] = in.nextInt();
                if (arr[j]%2==0) shet++;
                else neshet++;
            }
            boolean f =false;
            if (k%2==0) {
                for (int j = k-1; j >= 1; j-=2) {
                    if (neshet>=j&&shet>=k-j) {
                        f =true;
                        break;
                    }
                }
            }
            else {
                for (int j = k; j >= 1; j-=2) {
                    if (neshet>=j&&shet>=k-j) {
                        f =true;
                        break;
                    }
                }
            }
            if (f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
