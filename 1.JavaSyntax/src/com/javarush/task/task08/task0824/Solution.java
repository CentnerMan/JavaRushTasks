package com.javarush.task.task08.task0824;

/* 
Собираем семейство

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> humans = new ArrayList<>();
        Human kid1 = new Human("kid1", true, 10, new ArrayList<Human>());
        Human kid2 = new Human("kid2", true, 11, new ArrayList<Human>());
        Human kid3 = new Human("kid3", true, 12, new ArrayList<Human>());

        Human father = new Human("father", true, 70, new ArrayList<Human>() {{
            add(kid1);
            add(kid2);
            add(kid3);
        }});
        Human mother = new Human("mother", false, 70, new ArrayList<Human>() {{
            add(kid1);
            add(kid2);
            add(kid3);
        }});

        Human ded1 = new Human("ded1", true, 80, new ArrayList<Human>() {{
            add(father);
        }});
        Human baba1 = new Human("baba1", false, 80, new ArrayList<Human>() {{
            add(father);
        }});
        Human ded2 = new Human("ded2", true, 70, new ArrayList<Human>() {{
            add(mother);
        }});
        Human baba2 = new Human("baba2", false, 70, new ArrayList<Human>() {{
            add(mother);
        }});
        humans.add(ded1);
        humans.add(baba1);
        humans.add(ded2);
        humans.add(baba2);
        humans.add(father);
        humans.add(mother);
        humans.add(kid1);
        humans.add(kid2);
        humans.add(kid3);


        for (Human human : humans)
            System.out.println(human.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
