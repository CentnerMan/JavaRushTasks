package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код1
        HashMap< String, String>  copy = new HashMap< >(map);
        for (Map.Entry< String, String > entry : copy.entrySet()) {
            for (Map.Entry< String, String > maps : map.entrySet()) {
                if (entry.getValue().equals(maps.getValue()) && !entry.getKey().equals(maps.getKey())) {
                    removeItemFromMapByValue(map, entry.getValue());
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
