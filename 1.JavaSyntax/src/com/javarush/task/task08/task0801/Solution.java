package com.javarush.task.task08.task0801;

/* 
HashSet из растений

1. Объяви переменную коллекции HashSet с типом элементов String и сразу проинициализируй ee.
2. Программа не должна считывать строки с клавиатуры.
3. Программа должна добавлять в коллекцию 10 строк, согласно условию.
4. Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("арбуз");
        stringHashSet.add("банан");
        stringHashSet.add("вишня");
        stringHashSet.add("груша");
        stringHashSet.add("дыня");
        stringHashSet.add("ежевика");
        stringHashSet.add("женьшень");
        stringHashSet.add("земляника");
        stringHashSet.add("ирис");
        stringHashSet.add("картофель");

    for(String s: stringHashSet){
        System.out.println(s);
    }

    }
}
