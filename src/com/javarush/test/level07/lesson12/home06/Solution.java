package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
       Human grend1 = new Human();
        grend1.name = "дед";
        grend1.age = 66;
        grend1.sex = true;

        Human grend2 = new Human();
        grend2.name = "дед2";
        grend2.age = 65;
        grend2.sex = true;

        Human grendMa1 = new Human();
        grendMa1.name = "Баба";
        grendMa1.age = 59;
        grendMa1.sex = false;

        Human grendMa2 = new Human();
        grendMa2.name = "Виола";
        grendMa2.age = 60;
        grendMa2.sex = false;

        Human father1 = new Human();
        father1.name = "Pit";
        father1.age = 46;
        father1.sex = true;
        father1.mother = grendMa2;
        father1.father = grend2;

        Human mam1 = new Human();
        mam1.name = "Jen";
        mam1.age = 30;
        mam1.sex = false;
        mam1.mother = grendMa1;
        mam1.father = grend1;

        Human douther1 = new Human();
        douther1.name = "Jes";
        douther1.age = 10;
        douther1.sex = false;
        douther1.father = father1;
        douther1.mother = mam1;

        Human sun = new Human();
        sun.name = "ivan";
        sun.sex = true;
        sun.age = 12;
        sun.father = father1;
        sun.mother = mam1;

        Human sun2 = new Human();
        sun2.name = "Sivan";
        sun2.sex = true;
        sun2.age = 14;
        sun2.father = father1;
        sun2.mother = mam1;


        System.out.println(grend1);
        System.out.println(grend2);
        System.out.println(grendMa1);
        System.out.println(grendMa2);
        System.out.println(father1);
        System.out.println(mam1);
        System.out.println(douther1);
        System.out.println(sun);
        System.out.println(sun2);
        //напишите тут ваш код
    }

    public static class Human
    {
        protected  boolean sex;
        protected String name;
        protected Human mother;
        protected Human father;
        protected int age;

         //напишите тут ваш код

        public String toString()
        {
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
