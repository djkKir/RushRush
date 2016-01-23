package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        String s = "end";
        int isis = 0;
        boolean ss = true;

        while (ss)
        {
            list.add(reader.readLine());
            if (list.get(isis).equals("end")){
                ss = false;
                list.remove(isis);
            }
            else
            {
                isis++;
            }


        }

        for (int a = 0; a < list.size(); a++){
            System.out.println(list.get(a));
        }
        //напишите тут ваш код
    }
}
