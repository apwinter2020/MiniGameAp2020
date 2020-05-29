import controller.Administrator;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Administrator.getInstance().start();
    }
}