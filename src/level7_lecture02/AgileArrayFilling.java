package level7_lecture02;

/*
Иногда необходимо заполнить какую-то часть массива одинаковыми значениями или же удалить
существующие (присвоить значение null).
Реализуй для этого более гибкий метод fillArray(Integer[] array, int value, int begin, int end), где:
array — массив, который необходимо заполнить;
value — значение, которым необходимо заполнить;
begin — начиная с какого индекса необходимо заполнять (включительно);
end — на каком индексе остановить заполнение (исключая).
Требования:
•	Метод fillArray(Integer[] array, int value, int begin, int end) должен заполнять переданный в него
    массив значением value.
•	Метод fillArray(Integer[] array, int value, int begin, int end) должен заполнять только элементы
    от индекса begin(включительно) до индекса end (исключая).
 */

import java.util.Arrays;

public class AgileArrayFilling {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
        fillArrayCleanCode1(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
        fillArrayCleanCode2(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            Arrays.fill(array, begin, end, value);
        }
    }

    public static void fillArrayCleanCode1(Integer[] array, int value, int begin, int end) {
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }

    public static void fillArrayCleanCode2(Integer[] array, int value, int begin, int end) {
        Arrays.fill(array, begin, end, value);
    }
}

/*
    EXPLANATION:
    На строка 33-35 array.length раз повторяется заполнение массива статическим методом fill из класса утилит Arrays.
    Т.е. в данном случае 5 раз повторяется одно и тоже действие.
    Лучше выбирать что то одно, или цикл for и поэлементное заполнение массива (строки 39-41), или использование
    метода fill из класса утилит Arrays (строка 45).

    * fillArrayCleanCode1 и fillArrayCleanCode2 методы названы так схематично. На практике так называть не стоит.
 */