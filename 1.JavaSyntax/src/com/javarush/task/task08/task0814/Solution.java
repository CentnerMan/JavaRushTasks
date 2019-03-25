package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> integerHashSet = new HashSet<>();
        do {
            int temp = (int) (Math.random() * 30);
            if (!integerHashSet.contains(temp)) integerHashSet.add(temp);

        } while (integerHashSet.size() != 20);
        return integerHashSet;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (Integer i : set) {
            if (i <= 10) integerHashSet.add(i);
        }
        return integerHashSet;
    }

    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = createSet();
//        for (Integer i : integerHashSet) {
//            System.out.println(i);
//        }
//        System.out.println("-------------------");
//
        integerHashSet = removeAllNumbersGreaterThan10(integerHashSet);
//        for (Integer i : integerHashSet) {
//            System.out.println(i);
//        }
    }
}
