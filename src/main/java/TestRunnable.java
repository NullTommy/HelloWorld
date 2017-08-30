import java.util.Date;

public class TestRunnable implements Runnable {


    public static void main(String[] args){
        //使用 runnable 接口时，您不能直接创建所需类的对象并运行它；
        //必须从 Thread 类的一个实例内部运行它
        Thread tp1 = new Thread(new TestRunnable(1000, "Fast Guy"));
        tp1.start();
        Thread tp2 = new Thread(new TestRunnable(3000, "Slow Guy"));
        tp2.start();
    }

    int pauseTime;
    String name;
    public TestRunnable(int x, String n) {
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
