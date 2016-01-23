package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> peaple = new HashMap<String, String>();
        peaple.put("fed1", "med1");
        peaple.put("fed2", "med2");
        peaple.put("fed3", "med3");
        peaple.put("fed4", "med4");
        peaple.put("fed1", "med");
        peaple.put("fed5", "med5");
        peaple.put("fed7", "med1");
        peaple.put("fed6", "med");
        peaple.put("fed8", "med8");
        peaple.put("fed", "med9");


        //напишите тут ваш код

        return peaple;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
