public class Main implements Runnable {
  public static void main(String[] args) {
    Main tain = new Main();

    Thread thread = new Thread(tain);
    thread.start();
    while (thread.isAlive()) {
      System.out.println("processing..!");
    }
    System.out.println("Complete");
  }

  public void run() {
    System.out.println("Thread running...");
  }
}