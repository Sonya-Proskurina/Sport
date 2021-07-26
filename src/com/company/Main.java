package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s = in.next(), newS="";
        newS =s.replace("WUB"," ");
        newS=newS.replaceAll("[\\s]{2,}", " ");
        while (newS.toCharArray()[0]==' '){
            newS= new StringBuilder(newS).deleteCharAt(0).toString();
        }
        while (newS.toCharArray()[newS.length()-1]==' '){
            newS= new StringBuilder(newS).deleteCharAt(newS.length()-1).toString();
        }
        System.out.println(newS);
    }
}
