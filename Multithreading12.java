public class Multithreading12 {

    public static void main(String[] args) {
        Thread positiveThread = new Thread(new PositiveNumbersRunnable());
        positiveThread.start();

        Thread negativeThread = new Thread(new NegativeNumbersRunnable());
        negativeThread.start();
    }
}

class PositiveNumbersRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 25; i++) {
            System.out.println("Positive: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NegativeNumbersRunnable implements Runnable {
  
    public void run() {
        for (int i = -1; i >= -25; i--) {
            System.out.println("Negative: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}