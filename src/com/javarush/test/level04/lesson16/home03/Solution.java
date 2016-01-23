package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        int c = 0;
        while ( !(k == -1)) {
            String chislo = rdr.readLine();
            k = Integer.parseInt(chislo);
            c = c + k;

        }
        System.out.println(c);

         //Напишите тут ваш код
    }
}
