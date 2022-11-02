import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Подсчитайте сколько в массиве чётных элементов
        // и выведете это количество на экран на отдельной строке.
        // Прошу зафиксировать seed любым удобным способом для наиболее корректного воспроизведения решения


        int Even = 0;
        int[] arr = new int[15];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9);

            if (arr[i] % 2 == 0) {
                Even++;

            }

        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Even);


    }
}