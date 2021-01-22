package com.garnagaaa.lesson03.task01.app1;

/**
 * @author Aleksei Garnaga
 */
public class Program {
    public static void main(String[] args) {

        Number[] numbers = new Number[]{2, 4, 5, 2.2, 10L};
        MathBox mbox = new MathBox(numbers);
        System.out.println("Element: "+mbox);
        System.out.println("Remove 4");
        mbox.remove(4);
        System.out.println("Element: "+mbox);
        System.out.println("Sum: " + mbox.summator());
        mbox.splitter(2);
        System.out.println("Splitter (param: 2): "+ mbox);

    }
}