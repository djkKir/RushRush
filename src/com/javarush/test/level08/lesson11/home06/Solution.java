package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> people = new ArrayList<Human>();
        Human sun = new Human();
        sun.name = "first";
        sun.sex = true;
        sun.age = 1;
        people.add(sun);

        Human ch2 = new Human();
        ch2.name = "fred";
        ch2.sex = true;
        ch2.age = 4;
        people.add(ch2);

        Human ch3 = new Human();
        ch3.name = "megy";
        ch3.sex = false;
        ch3.age = 10;
        people.add(ch3);

        Human father = new Human();
        father.name = "ted";
        father.sex = true;
        father.age = 50;
        father.children.add(sun);
        father.children.add(ch2);
        father.children.add(ch3);
        people.add(father);

        Human mother = new Human();
        mother.name = "knorr";
        mother.sex = false;
        mother.age = 32;
        mother.children.add(ch2);
        mother.children.add(ch3);
        mother.children.add(sun);
        people.add(mother);

        Human gded = new Human();
        gded.name = "Ded";
        gded.sex = true;
        gded.age = 100;
        gded.children.add(mother);
        people.add(gded);

        Human gded2 = new Human();
        gded2.name = "Ded2";
        gded2.sex = true;
        gded2.age = 90;
        gded2.children.add(father);
        people.add(gded2);

        Human gMam = new Human();
        gMam.name = "victo";
        gMam.sex = false;
        gMam.age = 47;
        gMam.children.add(father);
        people.add(gMam);

        Human gMam2 = new Human();
        gMam2.name = "nerds";
        gMam2.sex = false;
        gMam2.age = 76;
        gMam2.children.add(mother);
        people.add(gMam2);




        for (int j = 0; j < people.size(); j++)
        {

        System.out.println(people.get(j));
        }
        //напишите тут ваш код
    }

    public static class Human
    {
        protected String name;
        boolean sex;
         int age;
        ArrayList<Human> children = new ArrayList<Human>();


         //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
