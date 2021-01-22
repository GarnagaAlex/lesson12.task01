package com.garnagaaa.lesson03.task01.app1;

import java.util.*;

import static java.util.stream.Collectors.toCollection;

/**
 * @author Aleksei Garnaga
 * Класс MathBox
 */
public class MathBox {

    private ArrayList<Number> nums = new ArrayList<>();

    /**
     * Конструктор
     * @param number Массив чисел
     */
    public MathBox(Number[] number) {
        nums.addAll(Arrays.asList(number));
    }

    /**
     * Метод возвращающий сумму элементов
     * @return Сумма элементов
     */
    public double summator() {
        double sum = 0;
        sum=nums.stream().map(Number::doubleValue).reduce((double) 0,(a, b)->a+b);
        return sum;
    }

    /**
     * Метод выполняющий поочередное деление всех элементов
     * @param divider Делитель
     */
    public void splitter(Number divider) {
        nums = nums.stream().map(Number::doubleValue).map((a)->a/divider.doubleValue()).map((a)->(Number)a).collect(toCollection(ArrayList::new));
    }

    /**
     * Метод удаления элемента из коллекции
     * @param element Элемент
     */
    public void remove(int element) {
        nums.remove((Number) element);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "nums=" + nums +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(nums, mathBox.nums);
    }

    @Override
    public int hashCode() {
        return nums.hashCode();
    }

}
