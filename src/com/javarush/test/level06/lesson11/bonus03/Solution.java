package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
g
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[5];
       // int[] number2 = new int[5];

        for (int i = 0; i < 5; i++)
        {
            number[i] = Integer.parseInt(reader.readLine());
        }

        for (int j = 0; j < number.length; j++ )
        {
            int min  = number[j];
            for (int k = j + 1; k < number.length ;)
                if (number[k] < number[j])
                {
                    int gg = number[j];
                    number[j] = number[k];
                    number[k] = gg;
                    k++;
                    //666

                }
                else
                {

                    k++;
                }
            //int s = min(number);
        }
        for (int i  = 0 ; i < number.length; i++)
            System.out.println(number[i]);//напишите тут ваш код
    }


}
