package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> month = new ArrayList<String>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("Jule");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

        String mon = reader.readLine();

        for (int i = 0; i < month.size(); i++)
        {

            if (mon.equals(month.get(i)))
            {
                System.out.println(mon + " is " + (i+1) + " month");
            }
        }
          //напишите тут ваш код
    }

}
