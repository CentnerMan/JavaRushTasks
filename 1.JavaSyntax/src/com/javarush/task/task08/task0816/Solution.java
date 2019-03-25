package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Carleone", df.parse("AUGUST 2 1981"));
        map.put("Strapone", df.parse("MAY 3 1982"));
        map.put("Macarone", df.parse("APRIL 4 1983"));
        map.put("Mascarpone", df.parse("MARCH 5 1984"));
        map.put("Kalzone", df.parse("SEPTEMBER 6 1985"));
        map.put("Marricone", df.parse("JANUARY 7 1986"));
        map.put("Pantalone", df.parse("MAY 8 1987"));
        map.put("Berluskoni", df.parse("DECEMBER 10 1988"));
        map.put("Jovanni", df.parse("NOVEMBER 9 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
//        for (HashMap.Entry<String, Date> entry : map.entrySet()) {
//            int month = entry.getValue().getMonth();
//            if (month > 4 && month < 6) {
//                map.remove(entry.getValue());
//            }
        map.entrySet().removeIf(entry -> (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8));
//            System.out.println(month);


    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> hashMap = createMap();
        removeAllSummerPeople(hashMap);

//        for (HashMap.Entry entry : hashMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: "
//                    + entry.getValue());
//        }

    }
}
