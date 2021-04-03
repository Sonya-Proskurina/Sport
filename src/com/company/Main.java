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
            boolean b=true;
            for (int j = 0; j <N-i-1 ; j++) {
                if (list.get(j)>list.get(j+1)){
                    int temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1, temp);
                    b=false;
                }
            }
            if (b) break;
        }

        for (int i = 0; i <N ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}