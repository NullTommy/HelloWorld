package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class TestLog {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        new Test().test();
    }
}

class Test {
    final Logger log = Logger.getLogger(Test.class);
    public void test() {
//        String string = this.getClass().getResource("").toString();
        String string = this.getClass().getResource("/").toString();
        System.out.println(string);
        log.info("hello this is log4j info log");
    }
}