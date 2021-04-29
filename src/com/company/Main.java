package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),myMax=0,myS=0,myMin=0;
        for (int i = 0; i <n ; i++) {
            int a=in.nextInt();
            if (a>myMax){
                myS=myMax;
                myMax=a;
            }
            else if (a<myMax&&a>myS){
                myMin=myS;
                myS=a;
            }
            else if (a<myMax&&a<myS&&a>myMin){
                myMin=a;
            }
        }
        if (myMax!=0&&myMin!=0&&myS!=0)
        System.out.println(myMax+" "+myS+" "+myMin);
        else System.out.println("-1 -1 -1");
    }
}
