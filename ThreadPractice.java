public class ThreadPractice extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is executed by "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Thread is printed by "+ Thread.currentThread().getName());
        ThreadPractice t = new ThreadPractice();
        ThreadPractice th = new ThreadPractice();
//        t.start();
//        th.start();
        t.setName("Satyam");
        th.setName("Akash");
        t.start();
        th.start();
    }
}
