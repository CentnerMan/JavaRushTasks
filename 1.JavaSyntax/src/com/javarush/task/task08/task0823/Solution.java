package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы

Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
//        String[] s1 = s.split(" ");
//        StringBuffer sb = new StringBuffer();
//
//        for (int i = 0; i < s1.length; i++) {
//            sb.append(Character.toUpperCase(s1[i].charAt(0)))
//                    .append(s1[i].substring(1)).append(" ");
//        }
//        System.out.println(sb.toString().trim());
        StringBuffer sb = new StringBuffer();
        char prev = s.charAt(0);
        if (prev == ' ') sb.append(prev);
        else sb.append(String.valueOf(prev).toUpperCase());
        for (int i = 1; i < s.length(); i++) {
            if (prev == ' ') sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            else sb.append(s.charAt(i));
            prev = s.charAt(i);
        }
        System.out.println(sb.toString());
    }
}
