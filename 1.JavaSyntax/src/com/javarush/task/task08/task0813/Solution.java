package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
1. Не изменяй заголовок метода createSet().
2. Программа не должна выводить текст на экран.
3. Программа не должна считывать значения с клавиатуры.
4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Лошадь");
        stringSet.add("Лодка");
        stringSet.add("Лось");
        stringSet.add("Лопух");
        stringSet.add("Лопата");
        stringSet.add("Лежак");
        stringSet.add("Ложе");
        stringSet.add("Ложь");
        stringSet.add("Лом");
        stringSet.add("Лоб");
        stringSet.add("Лоск");
        stringSet.add("Локоть");
        stringSet.add("Лапоть");
        stringSet.add("Ладья");
        stringSet.add("Лицо");
        stringSet.add("Лимон");
        stringSet.add("Лампада");
        stringSet.add("Лес");
        stringSet.add("Лук");
        stringSet.add("Лик");
        return stringSet;
    }

    public static void main(String[] args) {

    }
}
