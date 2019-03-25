package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения

Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
    String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("Иванов", "Иван");
        stringHashMap.put("Петров", "Иван");
        stringHashMap.put("Сидоров", "Сидор");
        stringHashMap.put("Васильев", "Василий");
        stringHashMap.put("Васильков", "Василий");
        stringHashMap.put("Семенов", "Семен");
        stringHashMap.put("Козлов", "Антон");
        stringHashMap.put("Борман", "Ганс");
        stringHashMap.put("Шульц", "Джошуа");
        stringHashMap.put("Саралидзе", "Иван");

        return stringHashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        if (map.containsKey(lastName)) {
            return 1;
        } else return 0;
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        for (HashMap.Entry entry : map.entrySet()) {
//            System.out.println("Фамилия: " + entry.getKey() + " Имя: "
//                    + entry.getValue());
//        }
//        System.out.println(getCountTheSameFirstName(map,"Иван"));
//        System.out.println(getCountTheSameFirstName(map,"Джон"));
//        System.out.println(getCountTheSameLastName(map,"Иванов"));
//        System.out.println(getCountTheSameLastName(map,"Путин"));
//    }
    }
}
