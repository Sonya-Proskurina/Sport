package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), d;
        int k=0;
        List<Integer> boys =new ArrayList<>(), girls = new ArrayList<>();
        for (int i = 0; i <m; i++) {
            boys.add(in.nextInt());
        }
        d = in.nextInt();
        for (int i = 0; i <d; i++) {
            girls.add(in.nextInt());
        }
        Collections.sort(boys);
        Collections.sort(girls);
        if (boys.size()>girls.size()){
            for (int i = 0; i <girls.size(); i++) {
                for (int j = 0; j <boys.size(); j++) {
                    if (boys.get(j)==girls.get(i)||boys.get(j)==girls.get(i)-1||boys.get(j)==girls.get(i)+1) {
                        boys.remove(j);
                        k++;
                        break;
                    }
                }
            }
        }
        else {
            for (int i = 0; i <boys.size(); i++) {
                for (int j = 0; j <girls.size(); j++) {
                    if (girls.get(j)==boys.get(i)||girls.get(j)==boys.get(i)-1||girls.get(j)==boys.get(i)+1) {
                        girls.remove(j);
                        k++;
                        break;
                    }
                }
            }
        }
        System.out.println(k);
    }
}
