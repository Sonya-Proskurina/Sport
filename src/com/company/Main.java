package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t= in.nextInt();
        for (int i = 0; i <t; i++) {
            long n=in.nextLong(), m=in.nextLong(), x=in.nextLong(), y=in.nextLong(), sum=0;
            for (int j = 0; j <n; j++) {
                String s=in.next();
                for (int k = 0; k <s.length(); k++) {
                    if (s.toCharArray()[k]=='.'&&k+1<s.length()&&s.toCharArray()[k+1]=='.'){
                        sum=(y<2*x)?sum+y:sum+x+x;
                        k++;
                    }
                    else if (s.toCharArray()[k]=='.'){
                        sum+=x;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
