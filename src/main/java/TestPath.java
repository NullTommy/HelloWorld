import org.apache.log4j.Logger;

public class TestPath {
    public static void main(String[] args) {

        //测试java中的一些路径问题
        final Logger log = Logger.getLogger(TestPath.class);

        String string1 = TestPath.class.getResource("").toString();
        log.info("当前类文件的URI目录。不包括自己："+string1);

        String string2 = TestPath.class.getResource("/").toString();
        log.info("当前Classpath的绝对URI路径："+string2);

        String string4 = TestPath.class.getClassLoader().getResource("").toString();
        log.info("当前ClassPath的绝对URI路径："+string4);

        String string3 = Thread.currentThread().getContextClassLoader().getResource("").toString();
        log.info("当前ClassPath的绝对URI路径："+string3);

        String string5 = ClassLoader.getSystemResource("").toString();
        log.info("当前ClassPath的绝对URI路径："+string5);

        String string6 = System.getProperty("user.dir").toString();
        log.info("当前用户路径："+string6);
//      下面的内容，还需要后续测试，请注意。
//        6.ServletActionContext.getServletContext().getRealPath(“/”)
//        Web应用程序 中，得到Web应用程序的根目录的绝对路径。这样，我们只需要提供相对于Web应用程序根目录的路径，就可以构建出定位资源的绝对路径。
//        如：file：/D:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WebProject


    }
}
