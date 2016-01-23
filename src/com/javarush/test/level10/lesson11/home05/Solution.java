package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

      //  String ss = "ФФФФФФФФФФАа";
        sumAbc(alphabet, list);

        //напишите тут ваш код
    }


    public static void  sumAbc(ArrayList<Character> arr, ArrayList<String>  string)
    {
       ArrayList<String> map = new ArrayList<String>();
        for (int j = 0; j < arr.size();j++)
        {
            int count = 0;

            for (int l = 0; l<string.size();l++)
            {
                char[] demon = string.get(l).toCharArray();

                for (int i = 0; i < demon.length; i++)
                {
                    if (demon[i] == arr.get(j))
                    {
                        count++;
                    }
                }

            }
            map.add(arr.get(j) + " " + count);
        }
        for (int k = 0; k< map.size();k++){
        System.out.println(map.get(k));}

    }
}