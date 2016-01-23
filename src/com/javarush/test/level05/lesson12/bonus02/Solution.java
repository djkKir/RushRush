package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        int[] ad = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String[] ads = new String[5];

        for (int i = 0; i < ad.length; i++)
        {
            String a = reader.readLine();
            ad[i] = Integer.parseInt(a);
        }


        /*for (int i = 0; i < 5; i++)
        {
            int[i] ad = Integer.parseInt(reader.readLine());
        }*/
        int min = ad[0];

        for (int i = 1; i < ad.length; i++)
        {
            if (ad[i] < min)
                min = ad[i];
        }


        System.out.println("Minimum = " + min);
    }


   /* public static int min(int a, int b)
    {
        return a < b ? a : b;
    }*/

}
