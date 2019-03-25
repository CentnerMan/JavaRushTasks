package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар

1. Объяви переменную коллекции HashMap с типом элементов String, String и сразу проинициализируй ee.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
4. Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> stringHashMap = new HashMap<String, String>();
        stringHashMap.put("арбуз", "ягода");
        stringHashMap.put("банан", "трава");
        stringHashMap.put("вишня", "ягода");
        stringHashMap.put("груша", "фрукт");
        stringHashMap.put("дыня", "овощ");
        stringHashMap.put("ежевика", "куст");
        stringHashMap.put("жень-шень", "корень");
        stringHashMap.put("земляника", "ягода");
        stringHashMap.put("ирис", "цветок");
        stringHashMap.put("картофель", "клубень");

        Iterator<Map.Entry<String, String>> iterator = stringHashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + " - " + value);
        }

//        for (Map.Entry<String, String> pair : stringHashMap.entrySet())
//        {
//            String key = pair.getKey();                      //ключ
//            String value = pair.getValue();                  //значение
//            System.out.println(key + " - " + value);
//        }
    }
}
