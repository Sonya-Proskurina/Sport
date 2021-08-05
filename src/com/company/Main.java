package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        for (int i = 0; i <n; i++) {
            int a = in.nextInt(),k=0;
            for (int j = 1; j <=a; j++) {
                boolean f =true;
                int x= j,z=x%10;
                while (x!=0){
                    if (x%10!=z) {
                        f=false;
                        break;
                    }
                    x=x/10;
                }
                if (f) k++;
            }
            System.out.println(k);
        }
    }
}
