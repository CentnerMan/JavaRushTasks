package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(reader.readLine());
            if (temp > maximum) maximum = temp;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
