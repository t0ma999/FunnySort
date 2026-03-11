public class SleepSort {
    public static void sleepSort(int[] arr) {
        for (int num : arr) {
            new Thread(() -> {
                try {
                    Thread.sleep(num * 100);
                    System.out.print(num + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
