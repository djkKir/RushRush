package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[] ss = s.toCharArray();
        //ArrayList<Character> ss = new ArrayList<Character>(); //System.out.println(ss);
        for(int j = 0; j < 40; j++ )
        {
        for (int i = j; i < ss.length; i++){
            System.out.print(ss[i]);// + ss[ss.length-1]);
           // ss[j].
        }
        System.out.println();
        }
        //напишите тут ваш код
    }

}
