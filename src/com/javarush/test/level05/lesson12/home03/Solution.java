package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для
 героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse miniMouse = new Mouse("Mini", 3 , 1);
        Mouse oncleMouse = new Mouse("Oncle", 42 , 6);

        Cat tomCat = new Cat("Tom", 12 , 5);
        Cat fattyCat = new Cat("Fatty", 13 , 2);

        Dog buchDog = new Dog("Buch", 20 , 15);

        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int  speed;

        public Cat(String name, int height, int speed)
        {
            this.name = name;
            this.height = height;
            this.speed = speed;
        }

    }

    public static class Dog
    {
        String name;
        int hight;
        int speed;

        public Dog(String name, int height, int speed)
        {
            this.name = name;
            this.hight = height;
            this.speed = speed;
        }

    }//добавьте тут ваши классы


}
