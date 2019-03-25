package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName); // дедушка

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName); //бабушка

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather, true); // отец

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, false); // mother

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        public Cat(String name, Cat parent, boolean sex) {
            this.name = name;
            if (sex) {
                this.father = parent;
            } else this.mother = parent;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother" + ", no father";
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + father.name;
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
