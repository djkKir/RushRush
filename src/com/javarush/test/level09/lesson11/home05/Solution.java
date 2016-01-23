package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String s = reader.readLine();

       //char[] strrr = new char[];
       ArrayList<Character> strarr ;
        ArrayList<Character> awo = new ArrayList<Character>();
        ArrayList<Character> bwo = new ArrayList<Character>();
        strarr = stringToChar(s);
        for (char gg : strarr)
        {
            if(isVowel(gg)){
                awo.add(gg);
            }
            else {bwo.add(gg);}
        }
       arrPrint(awo);
        System.out.println();
       arrPrint(bwo);
    }

    public static void arrPrint(ArrayList<Character> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.print(arr.get(i)+ " ");
        }
    }

    public static ArrayList<Character> stringToChar(String str)
    {
        ArrayList<Character> ss = new ArrayList<Character>();

        for(int i = 0; i < str.length(); i++)
        {
            ss.add(str.charAt(i));
        }
        return ss;
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
