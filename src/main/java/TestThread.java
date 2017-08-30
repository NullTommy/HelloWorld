import java.util.Date;

public class TestThread extends Thread {


    public static void main(String[] args){
        TestThread tp1 = new TestThread(1000, "Fast Guy");
        tp1.start();
        TestThread tp2 = new TestThread(3000, "Slow Guy");
        tp2.start();


    }

    int pauseTime;
    String name;
    public TestThread(int x, String n) {
        pauseTime = x;
        name = n;
    }


    public void run() {
        while(true) {
            try {
                System.out.println(name + ":" + new
                        Date(System.currentTimeMillis()));
                Thread.sleep(pauseTime);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }


}
