package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк

Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.


Требования:
1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Мама мыла раму 1!");
        a1.add("Оппа");
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("Мама мыла раму 2!");
        ArrayList<String> a3 = new ArrayList<>();
        a3.add("Мама мыла раму 3!");

        ArrayList<String>[] arrayList = new ArrayList[3];
        arrayList[0]=a1;
        arrayList[1]=a2;
        arrayList[2]=a3;

        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}