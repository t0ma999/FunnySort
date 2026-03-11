/*
    Для каждого числа запускается поток
    Поток спит столько миллисекунд, сколько равно числу
    Когда поток просыпается - он печатает число
 */

public class SleepSort {
    public static void sleepSort(int[] arr) {
        for (int num : arr) {
            new Thread(() -> {
                try {
                    Thread.sleep(num * 100L);
                    System.out.print(num + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
