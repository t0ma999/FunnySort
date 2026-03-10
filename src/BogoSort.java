/*
    BogoSort.
    Пока массив не отсортирован,
    мы случайно перемешиваем элементы.
    Когда массив случайно становится
    отсортированным - возвращаем его.
    */

public class BogoSort {
    public static int[] bogoSort(int[] arr){
        java.util.Random random = new java.util.Random();

        while (true) {

            boolean sorted = true;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return arr;
            }

            for (int i = 0; i < arr.length; i++) {
                int j = random.nextInt(arr.length);

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
