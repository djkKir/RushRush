package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0 ;

        String d = reader.readLine();
        int maxNumber = Integer.parseInt(d);
        int[] numbers = new int[maxNumber];

        for (int i = 0; i < numbers.length; i++){
            String ch = reader.readLine();
            numbers[i] = Integer.parseInt(ch);
        }
            maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++ ){
            if (maximum < numbers[i]){
                maximum = numbers[i];
            }

        }


        //напишите тут ваш код




        System.out.println(maximum);
    }
}
