package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(), b= in.nextInt(), c = in.nextInt();
        if (a==1&&b==1&&c==1) System.out.println(3);
        else if (a==1&&b==1) System.out.println(2*c);
        else if (a==1&&c==1) System.out.println(b+2);
        else if (b==1&&c==1) System.out.println(a*2);
        else if (a==1) System.out.println((b+1)*c);
        else if (b==1&&a<c) System.out.println((a+1)*c);
        else if (b==1) System.out.println(a*(c+1));
        else if (c==1) System.out.println(a*(b+1));
        else System.out.println(a*b*c);
    }
}
