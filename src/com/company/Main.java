package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int N=in.nextInt();

        for (int i = 0; i <N ; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i <N ; i++) {
           int minI=i;
            for (int j = i+1; j <N; j++) {
                if (list.get(j)<list.get(minI)){
                    minI=j;
                }
            }
            if (minI!=i){
                int c=list.get(minI);
                list.set(minI,list.get(i));
                list.set(i,c);
            }
        }

        for (int i = 0; i <N ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}