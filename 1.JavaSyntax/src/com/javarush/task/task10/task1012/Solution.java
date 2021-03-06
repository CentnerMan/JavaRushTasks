package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв

Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9


Требования:
1. Программа должна 10 раз считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // Симулируем ввод
        //        ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < 10; i++) {
//            String s = abc;
//            list.add(s.toLowerCase());
//        }


        // напишите тут ваш код
        int[] nums = new int[abc.length()];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                for (int k = 0; k < abc.length(); k++) {
                    if (list.get(i).charAt(j) == abc.charAt(k)) {
                        nums[k]++;
                    }
                }

            }
        }

        for (int i = 0; i < abc.length(); i++) {
            System.out.println(abc.charAt(i)+" "+ nums[i]);
        }

    }

}
