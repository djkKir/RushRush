package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
       private String name;
       private int age;
        private boolean sex;
        private long telephone;
        private String adress;
        private Human children;

        public Human(String name){
            this.name = name;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, Human children){
            this.name = name;
            this.children = children;

        }

        public Human(String name, long telephone, String adress){
            this.name = name;
            this.telephone = telephone;
            this.adress = adress;
        }

        public Human(String name, int age, boolean sex, long telephone){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.telephone = telephone;
        }

        public Human(String name, int age, boolean sex, String adress, long telephone){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.adress = adress;
            this.telephone = telephone;
        }

        public Human(String name, boolean sex, Human children){
            this.name = name;
            this.children = children;
            this.sex = sex;
        }

        public Human(long telephone, String adress){
            this.telephone = telephone;
            this.adress = adress;

        }

        public Human(String name, long telephone, String adress, boolean sex){
            this.name = name;
            this.telephone = telephone;
            this.adress = adress;
            this.sex = sex;
        }

        public Human(){

            String name;
            boolean sex;
        }



        //напишите тут ваши переменные и конструкторы
    }
}
