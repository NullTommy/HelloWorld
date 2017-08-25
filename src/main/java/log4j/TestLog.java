package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class TestLog {
    public static void main(String[] args) {
//        BasicConfigurator.configure(); //加载的应该是log4j的默认配置文件，自行设置的配置文件不会生效
        new Test().test();
    }
}

class Test {
    final Logger log = Logger.getLogger(Test.class);
    public void test() {
        log.info("hello this is log4j info log");
    }
}