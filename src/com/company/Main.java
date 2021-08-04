package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k;
        k=n+1;
        while (k%10==k/10%10||k%10==k/100%10||k%10==k/1000
        ||k/10%10==k/100%10||k/10%10==k/1000
        ||k/100%10==k/1000){
            k++;
        }
        System.out.println(k);
    }
}
