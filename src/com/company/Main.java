package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(),n,k;
        for (int i = 0; i <t ; i++) {
            n=in.nextInt();
            int[] arr=new int[n];
            k=in.nextInt();

            for (int j = 0; j <n ; j++) {
                 arr[j]=in.nextInt();
            }
            int s=0;
            for (int j = 0; j <k; j++) {
                if (arr[s]!=0&&s!=n-1) {
                    arr[s]--;
                    arr[n-1]++;
                }
                else if (s!=n-1) {
                    s++;
                    j--;
                }
                else break;
            }
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[j]+" ");
            }
        }
    }
}
