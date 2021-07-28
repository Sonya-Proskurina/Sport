package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s= in.next();
        int n=0;
        char[] arr=new char[s.length()*2];
        for (int i = 0; i <s.length(); i++) {
            if (s.toCharArray()[i]!='A'&&s.toCharArray()[i]!='O'&&s.toCharArray()[i]!='Y'&&s.toCharArray()[i]!='E'&&
                    s.toCharArray()[i]!='U'&&s.toCharArray()[i]!='I'&&
                    s.toCharArray()[i]!='a'&&s.toCharArray()[i]!='o'&&s.toCharArray()[i]!='y'&&s.toCharArray()[i]!='e'&&
                    s.toCharArray()[i]!='u'&&s.toCharArray()[i]!='i'){
                arr[n]='.';
                n++;
                arr[n]=((int)s.toCharArray()[i]>90)?s.toCharArray()[i]:(char)((int)s.toCharArray()[i]+32);
                n++;
            }
        }
        System.out.println(String.valueOf(arr).replaceAll("\u0000",""));
    }
}
