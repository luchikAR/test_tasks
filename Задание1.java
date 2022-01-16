import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	   // Задание №1
	   // задаём массив в которой мы будем искать 3-й по велечине элемент
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

        // сортировка массива, если учитываем повторяющиеся числа
        for(int i = 0; i < 20; i++) {
            for (int j = i + 1; j < 20; j++) {
                // if (arr[i] == arr[j])            // если не учитываем повторения
                //     arr[i] = Integer.MAX_VALUE;
                if(arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Ответ: " + arr[2]);
	}
}
