package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            if (i==0) arr[0] = in.nextInt();
            else arr[i] = in.nextInt() + arr[i-1];
        }
        int m =in.nextInt();
        for (int i = 0; i <m; i++) {
            int k =in.nextInt(),z=1;
            int left=0,rigt=n,midl;
            while (true){
                midl=(rigt+left)/2;
                if (arr[midl]>=k&&(midl==0||arr[midl-1]<=k)){
                    z=midl;
                    if (midl!=0&&arr[midl-1]==k) z--;
                    break;
                }
                else if (arr[midl]>=k&&midl!=0&&arr[midl-1]>k){
                    rigt=midl;
                }
                else if (arr[midl]<k){
                    left=midl;
                }
            }
            System.out.println(z+1);
        }
    }
}
