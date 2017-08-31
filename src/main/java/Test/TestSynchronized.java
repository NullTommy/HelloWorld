package Test;

public class TestSynchronized implements Runnable {

    public static void main(String[] args){
        //使用 runnable 接口时，您不能直接创建所需类的对象并运行它；
        //必须从 Thread 类的一个实例内部运行它
        Thread tp1 = new Thread(new TestSynchronized(10000, "Fast Guy"));
        tp1.start();
        Thread tp2 = new Thread(new TestSynchronized(3000, "Slow Guy"));
        tp2.start();
    }

    int pauseTime;
    String name;
    public TestSynchronized(int x, String n) {
        pauseTime = x;
        name = n;
    }

    synchronized public void getName() {

        try {
            System.out.println(name+"：睡觉");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while(true) {
            try {
                getName();
                Thread.sleep(pauseTime);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

}
