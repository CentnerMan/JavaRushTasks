package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой

1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date start = new Date (date);
        start.setMonth(0);
        start.setDate(0);
        Date today = new Date (date);
        long msDistance = today.getTime()-start.getTime();
        long msDay = 24*60*60*1000;
        int dayCount = (int) (msDistance/msDay);

        if (dayCount % 2 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}