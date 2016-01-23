package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man mann = new Man("tim", 13, "earth");


        Woman womann = new Woman("isolda", 21, "mars");


        //создай по два объекта каждого класса тут

        System.out.println(mann.name + " " + mann.age + " " + mann.address);
        System.out.println(womann.name + " " + womann.age + " " + womann.address);//выведи их на экран тут
    }


    public static class Man
    {
        String name;
        int age;
        String address;

        Man(String a, int b, String c)
        {
            name = a;
            age = b;
            address = c;

        }

        public Man(String a, int b)
        {
            name = a;
            age = b;
        }

        Man(String name)

        {
            this.name = name;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;
        //добавьте тут ваши классы

        Woman(String name, int age, String address)
        {
            this.name = name;
            this.age =  age;
            this.address = address;
        }

        Woman(String name, int age)
        {
            this.name = name;
            this.age =  age;

        }

        Woman(String name)
        {
            this.name = name;

        }
    }
}
