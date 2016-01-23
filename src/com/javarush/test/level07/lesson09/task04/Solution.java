package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
       list.add("роза"); //0
       list.add("лира"); //1
        list.add("лоза");
        list.add("топор");
        list.add("ло");
       list.add("рррлрр");
         //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //ArrayList<String> test = new ArrayList<String>();
        for (int k = 0; k < list.size();)
        {
            int countL = 0;
            int countR = 0;
          //char[] fric = new char[list.get(k).length()];
            String g = list.get(k);

           char[] fric = g.toCharArray(); // returns a length 4 char array ( 'l','i','n','e' )


            for (int i = 0; i < g.length() ;i++ )
            {
            //System.out.print(fric[i] + " ");
             if (fric[i] == 'р')
                 {
                  countR++;
                  }
              if (fric[i] == 'л')
                 {
                  countL++;
                 }

             }

            if(countL == 0 && countR > 0 )
            {
            list.remove(k);
            k = k - 1;
            }
            if (countL > 0 && countR == 0)
            {
                list.add(k , list.get(k));
                k = k + 2;
            }
            else
            {
                k++;
            }
            //System.out.println("    р " + countR + " л " + countL);
          //  k++;
        }

        return list;
    }



}