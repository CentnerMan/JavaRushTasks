package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human

Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private String fatherName;
        private int age;
        private boolean sex;
        private String address;

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname, String fatherName) {
            this.name = name;
            this.surname = surname;
            this.fatherName = fatherName;
        }

        public Human(String name, String surname, String fatherName, int age) {
            this.name = name;
            this.surname = surname;
            this.fatherName = fatherName;
            this.age = age;
        }

        public Human(String name, String surname, String fatherName, int age, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.fatherName = fatherName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, String fatherName, int age, boolean sex, String address) {
            this.name = name;
            this.surname = surname;
            this.fatherName = fatherName;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, boolean sex, String address) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }
    }
}
