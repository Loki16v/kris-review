package level5_lecture01;

/*
Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один
массив resultArray. Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
Программа должна правильно обрабатывать массивы любой длины.

Требования:
•	В классе Solution должна быть публичная статическая переменная firstArray типа int[], проинициализированная
    массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная secondArray типа int[], проинициализированная
    массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная resultArray типа int[].
•	Реализуй метод main(String[]) согласно условию.
 */

public class MergeArrays {
    public static void main(String[] args) {
        //solution();
        cleanCodeSolution();
    }

    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void solution() {
        resultArray = new int[firstArray.length + secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int j = 0; j < secondArray.length; j++) {
            resultArray[j + firstArray.length] = secondArray[j];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }

    public static void cleanCodeSolution() {
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i + firstArray.length] = secondArray[i];
        }
    }
}
/*
    EXPLANATION:
    Тут тоже все в порядке и логично. Хочется только отметить:
     - счетчик не обязательно называть разными буквами (i, j), если независимые циклы на одном уровне, т.е. не лежат
        один внутри другого. Но это не принципиально совсем.
     - переменная count на строке 29 нигде не используется соответственно ее можно удалить из кода. Проходи код глазами,
        записывая переменные итераций на бумаге, если сложно запоминать. Поможет избавиться от избыточного кода и
        хорошо разовьет мышление в будущем.
     - строки 36-38 - вывод значений в консоль. В условиях нет такой задачи(часто вижу). Экспериментировать и выводить
        в консоль для проверки собственного кода очень грамотное решение, одобряю. Но на проверку
        (а в будущем на ревью =) нужно выводить только то, что было в задании. Важно привыкать выполнять строго только
        то, что требуется. Это мелочь, но важно. Сдавая код на проверку надо помнить, что его кто-то будет смотреть и
        проверять насколько он соответствует заданию. Любое не согласованное (даже!!) улучшение может повлечь отзыв,
        что коллега систематически не выполняет четко указанные требования.
 */