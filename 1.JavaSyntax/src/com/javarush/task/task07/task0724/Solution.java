package com.javarush.task.task07.task0724;

/* 
Семейная перепись

1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {

        Human grandFatherPapa = new Human("Иван", true, 65);
        Human grandMotherPapa = new Human("Марья", false, 63);
        Human grandFatherMama = new Human("Петр", true, 60);
        Human grandMotherMama = new Human("Дарья", false, 56);
        Human papa = new Human("Сергей", true, 40, grandFatherPapa, grandMotherPapa);
        Human mama = new Human("Зоя", false, 36, grandFatherMama, grandMotherMama);
        Human son = new Human("Александр", true, 20, papa, mama);
        Human daughter = new Human("Клавдия", false, 18, papa, mama);
        Human daddy = new Human("Жорж", true, 40, grandFatherPapa, grandMotherPapa);

        System.out.println(grandFatherPapa.toString());
        System.out.println(grandMotherPapa.toString());
        System.out.println(grandFatherMama.toString());
        System.out.println(grandMotherMama.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());
        System.out.println(daddy.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}