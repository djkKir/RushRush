package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
       BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
       String tx1="Я буду зарабатывать $";
        String tx2=" в час";
        String sP = rdr.readLine();
       //int nP = Integer.parseInt(sP);
       System.out.println(tx1+sP+tx2);//Напишите тут ваш код
    }
}