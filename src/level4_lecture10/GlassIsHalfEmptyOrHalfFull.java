package level4_lecture10;

import java.util.Scanner;

/*
В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан. Для пессимиста
он наполовину пуст, а для оптимиста - наполовину полон. Необходимо считать с клавиатуры данные типа boolean, используя
метод nextBoolean() объекта типа Scanner. В зависимости от полученных данных, округлить переменную glass: до целого
числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.

        Пример ввода:
        true

        Пример вывода:
        1

Подсказка:
Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().

        Требования:
        •	Программа должна считывать c клавиатуры данные типа boolean.
        •	Программа должна выводить целое число на экран согласно условию.
        •	В программе необходимо использовать метод Math.floor().
        •	В программе необходимо использовать метод Math.ceil().
 */

public class GlassIsHalfEmptyOrHalfFull {
    public static void main(String[] args) {
        //solution();
        cleanCodeSolution();
    }

    public static void solution() {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
            boolean x = console.nextBoolean();
            if (x == true) {
                int a = (int) Math.ceil(glass);
                System.out.println(a);
            } else if (x == false) {
                int b = (int) Math.floor(glass);
                System.out.println(b);
        }

    }

    public static void cleanCodeSolution() {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        boolean x = console.nextBoolean();
        if (x == true) {
            int a = (int) Math.ceil(glass);
            System.out.println(a);
        } else {
            int b = (int) Math.floor(glass);
            System.out.println(b);
        }
    }
}

/*
    EXPLANATION:
    Т.к. тип boolean имеет только 2 значения (true/false) и третьего не бывает - лучше использовать обычный if else с
    одним условием в круглых скобках, if(){} else if(){} предназанчен для обработки более 2 условий. В ReadMe.txt
    описаны все виды if, if else и условия их применения.
 */
