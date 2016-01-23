package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
ArrayList<String> g1 = new ArrayList<String>();
ArrayList<String> g2 = new ArrayList<String>();
ArrayList<String> g3 = new ArrayList<String>();
        for (int j = 0; j < 3; j++)
        {
            g1.add("silent");
            g2.add("eat");
            g3.add("brein");
        }
        ArrayList<String>[] gg = new ArrayList[3];



          gg[0] = g1;
          gg[1] = g2;
          gg[2] = g3;


        //напишите тут ваш код

        return gg;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}