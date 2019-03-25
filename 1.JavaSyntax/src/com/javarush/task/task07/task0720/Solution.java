package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела

1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        ArrayList<String> strings = new ArrayList<String>();
//        System.out.print("Введите количество вводимых строк n: ");
        n = Integer.parseInt(reader.readLine());
//        System.out.print("Введите количество переставляемых строк m: ");
        m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            strings.add(strings.get(0));
            strings.remove(0);
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        //напишите тут ваш код
    }
}
