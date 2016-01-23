package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
       // System.out.print("Enter N ");
        int numList = Integer.parseInt(reader.readLine());
       // System.out.print("Enter first M number ");
        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numList; i++)
        {
            list.add(reader.readLine());
        }

        for (int j = 0; j < number; j++)
        {
            list.add(numList, list.get(0));
           list.remove(0);
        }

        for (int k = 0; k < list.size(); k++)
        {
            System.out.println(list.get(k));
        }

        //напишите тут ваш код
    }
}
