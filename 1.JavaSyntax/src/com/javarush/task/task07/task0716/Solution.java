package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л

1. Программа не должна считывать данные с клавиатуры.
2. Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
3. Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
4. Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
5. Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        int i = 0;

        while (list.size() - i != 0) {
            String tempString = list.get(i);
            if (tempString.contains("р") && !tempString.contains("л")) { //contains "р" and not contains "л"
                list.remove(i);
            }
            if (!tempString.contains("р") && tempString.contains("л")) { //not contains "р" and contains "л"
                list.add(i + 1, tempString);
                i = i + 2;
            }
            //not contains "р" and not contains "л" or contains "р" and contains "л"
            if ((tempString.contains("р") && tempString.contains("л")) || (!tempString.contains("р") && !tempString.contains("л"))) {
                i++;
            }
        }
        return list;
//        return null;

    }
}