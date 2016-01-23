package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        //List<String> addresses = new ArrayList<String>();
        Map <String, String> adresses = new HashMap<String, String>();
        while (true)
        {
            String sity = reader.readLine();
            if (sity.isEmpty() ) break;

            String family = reader.readLine();
            if (family.isEmpty()) break;

          adresses.put(sity, family);
        }

        //read home number
         /*int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size())
        {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/
        // read sity
        String sityNumber = reader.readLine();

        for (Map.Entry<String, String> pair : adresses.entrySet())
        {
            if (sityNumber.equals(pair.getKey()))
            {
                String familySecondName = pair.getValue();
                System.out.println(familySecondName);
            }
        }
    }
}