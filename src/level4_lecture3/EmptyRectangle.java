package level4_lecture3;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
размером 10 (высота) на 20 (ширина) из букв 'Б'. Незаполненная часть состоит из пробелов.

        Пример вывода:
        ББББББББББББББББББББ
        Б                  Б
        Б                  Б
        Б                  Б
        Б                  Б
        Б                  Б
        Б                  Б
        Б                  Б
        Б                  Б
        ББББББББББББББББББББ

        Требования:
        •	Программа должна выводить текст на экран.
        •	Программа должна выводить контур прямоугольника высотой 10 и шириной 20 из буквы 'Б'.
        •	В программе необходимо использовать вложенные циклы while (цикл в цикле).
        •	Вывод на экран должен происходить в цикле while.
 */

public class EmptyRectangle {
    public static void main(String[] args) {
        //yourSolution();
        cleanCodeSolution();
    }

    public static void yourSolution() {
        int n = 0;
        while (n < 10) {
            int m = 0;
            while (m < 20) {
            if (n == 0 || n == 9) {
                    System.out.print("Б");
                } else if (m == 0 || m == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                m++;
            }
            System.out.println();
            n++;
            }

    }

    public static void cleanCodeSolution() {
        int n = 0;
        while (n <  10) {
            int m = 0;
            while (m < 20) {
                if (n == 0 || n == 9 || m == 0 || m == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                m++;
            }
            System.out.println();
            n++;
        }
    }
}

/*
    EXPLANATION:
    Т.к. в строках 38 и 40 выполняется одно и тоже действие - условия двух if'ов можно объединить в один if else.
    Напомню что || (логическое или) вернет true, если хотя бы одно из условий будет true.
        (условие1 || условие2 || условие3 || условие4 || .....)
    Предположим условие1 вернуло false, далее логическое или проверяет условие2, и если условие2 вернуло true, то
    условия 3 и 4 не проверяются и не выполняются программой вообще, т.к. в этом нет смысла - мы ждали хотя бы один
    true и уже получили его.
    С && (логическое и) ситуация зеркальная - вернет true только, если все из условий вернули true:
        (условие1 && условие2 && условие3 && условие4 && .....)
    Если первое условие окажется false, то условия 2, 3, 4 и т.д. не будут проверяться и не будут выполняться
    программой.

    Почему я это рассказываю? представим кусочек кода:

    if (x > 0 || Integer.parseInt("W")) {

    }

    Программа будет идеально проходить без ошибок пока х больше 0.

 */
