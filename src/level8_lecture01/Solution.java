package level8_lecture01;

/*
В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, который будет работать
как шар предсказаний. Он случайным образом возвращает фразу-ответ на заданный вопрос. В методе getPrediction()
нужно использовать метод nextInt(int) класса Random, который должен возвращать значения от 0 до 7 включительно.
В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа:
0 -> Бесспорно
1 -> Определённо да
2 -> Вероятнее всего
3 -> Хорошие перспективы
4 -> Спроси позже
5 -> Попробуй снова
6 -> Мой ответ — нет
7 -> Весьма сомнительно
Иначе вернуть null.

Требования:
•	Реализуй метод getPrediction() согласно условию.
 */

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Заработаю ли я себе на BMW?");
        //System.out.println(MagicBall.getPrediction());
        System.out.println(MagicBall.getPredictionCleanCode());
    }
}

class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";


    public static String getPrediction() {
        //напишите тут ваш код
        Random r = new Random();
        int x = r.nextInt(8);
        if (x == 0){
            return CERTAIN;
        } else if (x == 1) {
            return DEFINITELY;
        } else if (x == 2) {
            return MOST_LIKELY;
        } else if (x == 3) {
            return OUTLOOK_GOOD;
        }  else if (x == 4) {
            return ASK_AGAIN_LATER;
        } else if (x == 5) {
            return TRY_AGAIN;
        } else if (x == 6) {
            return NO;
        } else if (x == 7) {
            return VERY_DOUBTFUL;
        } return null;
    }

    public static String getPredictionCleanCode() {
        String[] options = new String[]{CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD, ASK_AGAIN_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};
        return options[new Random().nextInt(8)];
    }
}
