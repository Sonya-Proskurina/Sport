package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),b=in.nextInt();
        double sum=0;
        sum+=b;
        int[] arr=new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        boolean f=true;
        double sum2=0;
        for (int i = 0; i <n; i++) {
            if (arr[i]>(sum/n)) {
                f=false;
                break;
            }
            sum2+=(sum/n)-arr[i];
        }

        if (!f||(int)sum2*1000000>(int)b*1000000) System.out.println(-1);
        else {
            for (int i = 0; i <n ; i++) {
                System.out.printf("%.7f\n", (sum/n)-arr[i]);
            }
        }
    }
}
