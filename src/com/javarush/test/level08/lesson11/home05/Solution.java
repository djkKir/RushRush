package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  conversetion = reader.readLine();
        char[] ch = conversetion.toCharArray();
        if (ch[0] != ' ') ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 0; i < ch.length - 1; i++){

            if ( ch[i] == ' '  && ch[i + 1] != ' ')
            {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);     }

        }
        String css = new String(ch);




        System.out.println(css);

        //напишите тут ваш код

    }
    /*static public String war(String conversetion)
    {
        char[] ch = conversetion.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 1; i < ch.length - 1; i++){
            if ( ch[i] == ' ' && ch[i + 1] != ' ')
            {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);     }

        }
        String cOnversetionss = new String(ch);
        return cOnversetionss;
    }
*/

}
