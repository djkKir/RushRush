package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ch1 = reader.readLine(); //Напишите тут ваш код
        String ch2 = reader.readLine(); //Напишите тут ваш код
        String ch3 = reader.readLine();
        int a = Integer.parseInt(ch1);
        int b = Integer.parseInt(ch2);
        int c = Integer.parseInt(ch3);

        if (a < b && a < c){
            if (b < c){
                System.out.println(b);
            }
            else
            System.out.println(c);
        }
        else if (b < a && b < c) {
            if (a < c)
            System.out.println(a);
            else
                System.out.println(c);
        }
        else if (c < a && c < b){
            if (a < b)
            System.out.println(a);
            else
                System.out.println(b);
        }
    }
}
