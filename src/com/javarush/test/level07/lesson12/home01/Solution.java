package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];

        for (int i = 0; i < list.length; i++ )
        {
        list[list.length - 1 - i]  = Integer.parseInt(reader.readLine());
         //напишите тут ваш код
        }
        for (int j = 0; j < list.length; j++)
        {
            System.out.println(list[j]);
        }
    }
}
