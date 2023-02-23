package com.hiilel.lessons.lesson15Exception.main2.HomeWork;
/*

1. Создать класс ArrayValueCalculator

2. Создать метод doCalc. На вход методу подаётся двумерный строковый массив размером 4х4.

3. При передаче массива другого размера в метод doCalc, необходимо выбросить исключение MyArraySizeException.

4. Метод doCalc должен пройтись по всем элементам массива и преобразовать в int (использовать Integer#parseInt)
и просуммировать. После общего суммирования, метод возвращает финальный результат в виде int.

5.Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
тогда быть выброшено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.

6. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
 и вывести результат расчета.

7. * Необходимо соблюдать все правила сохранения контекста выброшенного исключения.

8. * При отлове исключений в процессе преобразования, принять во внимание исключения выбрасываемые другими (сторонними)
 методами, что используются.
 */

//import static com.hiilel.lessons.lesson15Exception.main2.HomeWork.ArrayValueCalculator.doCalc;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        System.out.println("Try One");
        System.out.println(tryArray(calculator, new String[][]{}));

        System.out.println("Try Two");
        System.out.println(tryArray(calculator, new String[][]{{"123", "2"}}));

        System.out.println("Try Three");
        System.out.println(tryArray(calculator, new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "A"},
                {"1", "1", "1", "1"},
        }));

        System.out.println("Try Four");
        System.out.println(tryArray(calculator, new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
        }));

    }

    static int tryArray(ArrayValueCalculator calculator, String[][] values) {
        try {
            return calculator.doCalc(values);
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
            System.out.println("Matrix does have incorrect size. Please check it");
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
            System.out.println("Matrix does have broken value. Please check it");
        }
        return 0;
    }
}
