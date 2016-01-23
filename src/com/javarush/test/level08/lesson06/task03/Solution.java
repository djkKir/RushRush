package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {
       ArrayList list = new ArrayList();
       LinkedList list1 = new LinkedList();
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long  getTimeMsOfInsert(List list)
    {
        Date currentD = new Date(); //напишите тут ваш код

        insert10000(list);

        Date new1Data = new Date();

        long timeIs = new1Data.getTime() - currentD.getTime();
        return timeIs;
         //напишите тут ваш код

    }

    public static void insert10000(List list)
    {

        for (int i=0;i<20000;i++)
        {
            list.add( new Object());
        }
    }
}
