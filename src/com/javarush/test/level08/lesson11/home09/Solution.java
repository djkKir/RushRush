package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате
Не забудьте учесть первый день года.
Пример:
 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
       String s = "MAY 1 2013";
       System.out.println(isDateOdd(s));

        /*s = "JANUARY 1 2000";
        System.out.println(isDateOdd(s));

         s = "February 02 2016";
        System.out.println(isDateOdd(s));
*/
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        SimpleDateFormat format1 = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        SimpleDateFormat format2 = new SimpleDateFormat("DD");

        Date dd = format1.parse(date);

        Date dd2 = new Date(dd.getTime());

        int dayOfYee = Integer.parseInt(format2.format(dd2));


         if ((dayOfYee % 2) == 0){
             return false;
         }
        else{
        return true;}

    }
}
