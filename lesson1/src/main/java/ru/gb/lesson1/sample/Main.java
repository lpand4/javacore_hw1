package ru.gb.lesson1.sample;

import ru.gb.lesson1.regular.Decorator;
import ru.gb.lesson1.regular.OtherClass;

/**
 * Основной класс приложения.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args стандартные аргументы командной строки.
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));

    }
}
