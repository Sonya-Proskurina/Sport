package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();

        for (int i = 0; i <n; i++) {
            int k=in.nextInt(), x= in.nextInt();
            List<Long> arrMax = new ArrayList<>();

            arrMax.add(in.nextLong());
            long myMax=0, myMin=arrMax.get(0);

            for (int j = 1; j <k; j++) {
                long a = in.nextLong();
                arrMax.add(a);
                myMin=(myMin+a);
            }

            int ost0 = (myMin%x==0)?0:1;
            myMin/=x;
            myMin+=ost0;

            for (int j = 0; j <arrMax.size(); j++) {
                int ost = (arrMax.get(j)%x==0)?0:1;
                myMax+=arrMax.get(j)/x+ost;
            }
            System.out.println(myMin+" "+myMax);

        }
    }
}
