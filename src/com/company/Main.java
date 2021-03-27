package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	String s=in.next();
	int n=0;
	int[] arr= new int[s.length()/2+s.length()%2];
        for (int i = 0; i <s.length() ; i+=2) {
            arr[n]=(Integer.parseInt(String.valueOf(s.toCharArray()[i])));
            n++;
        }
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if (i!=arr.length-1) System.out.print(arr[i]+"+");
            else System.out.println(arr[i]);
        }
    }
}
