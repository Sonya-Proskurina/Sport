package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt(), minSum=0, k=0, tempSum=0;

        Integer[] arr = new Integer[n];
        for (int i = 0; i <n; i++) {
            arr[i]=in.nextInt();
            minSum+=arr[i];
        }

        minSum/=2;
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i <n; i++) {
            tempSum+=arr[i];
            k++;
            if (tempSum>minSum){
                break;
            }
        }

        System.out.println(k);
    }
}
