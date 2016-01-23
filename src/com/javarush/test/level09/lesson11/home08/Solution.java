package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
 Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> hh = new ArrayList<int[]>();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {61,72};
        int[] c = {1, 2, 3, 4};
        int[] d = {1, 2, 3, 4, 5, 55, 65};
        int[] e = new int[0];
        hh.add(a);
        hh.add(b);
        hh.add(c);
        hh.add(d);
        hh.add(e);
        return hh;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
