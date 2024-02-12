package Threads;
public class OddEven {

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        oddThread.start();
        evenThread.start();
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 60; i += 2) {
                System.out.println("Odd: " + i);
            }
        }
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 60; i += 2) {
                System.out.println("Even: " + i);
            }
        }
    }
}



