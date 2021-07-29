package com.company;

import java.util.*;

public class Test {
    public static List<Integer> newHappy(int p,List<Integer> arr) {
    List<Integer> list= new ArrayList<>();
        for (int i = 0; i <arr.size(); i++) {
            if (arr.get(i)>Math.pow(10,p)){
                list.add((int)Math.pow(10,p+1)*4+arr.get(i));
                list.add(((int)Math.pow(10,p+1)*7)+arr.get(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(7);
        List<Integer> newA = newHappy(0,list);

        for (int i = 0; i <newA.size(); i++) {
            list.add(newA.get(i));
        }
        newA = newHappy(1,list);
        for (int i = 0; i <newA.size(); i++) {
            list.add(newA.get(i));
        }

        Collections.sort(list);
        int ind=0,f=0;
        while (list.get(ind)<=n) {
            if (n%list.get(ind)==0) {
                f=1;
                break;
            }
            ind++;
        }
        if (f==1) System.out.println("YES");
        else System.out.println("NO");
    }
}
