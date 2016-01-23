package com.javarush.test.level06.lesson11.home02;


import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот.
 Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {


   // public static int count = 0;
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {


        Cat mur1 = new Cat();
        cats.add(mur1);
        Cat mur2 = new Cat();
        cats.add(mur2);
        Cat mur3 = new Cat();
        cats.add(mur3);
        Cat mur4 = new Cat();
        cats.add(mur4);
        Cat mur5 = new Cat();
        cats.add(mur5);
        Cat mur6 = new Cat();
        cats.add(mur6);
        Cat mur7 = new Cat();
        cats.add(mur7);
        Cat mur8 = new Cat();
        cats.add(mur8);

        Cat mur9 = new Cat();
        cats.add(mur9);

        Cat mur10 = new Cat();
        cats.add(mur10);



        //Создай тут 10 котов
        printCats();
       // System.out.println(count);
    }

   // public  Cat() {
      //  cats.add(new Cat());
    //}
    public static void printCats() {
        for (int j = 0; j < cats.size(); j++)
        {
            System.out.println(cats.get(j));
        }
         //Добавь свой код для пункта 3 тут
    }
}
