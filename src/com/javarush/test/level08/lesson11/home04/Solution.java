package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {

        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++){
           // System.out.println(array.get(i));
            if (array.get(i) < min)
                min = array.get(i);

        }
        //System.out.println("");
        // Найти минимум
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int numN = Integer.parseInt(reader.readLine());


        // final Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

         for (int i = 0; i < numN; i++)
          list.add(Integer.parseInt(reader.readLine())); //Тут создать и заполнить список
        return list;
    }
}
