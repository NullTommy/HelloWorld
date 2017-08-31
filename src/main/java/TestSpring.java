import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
//        通过String数组
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "aapplicationContext.xml" });
//        单纯通过文件名
        ApplicationContext context = new ClassPathXmlApplicationContext("aapplicationContext.xml");

        Category c = (Category) context.getBean("d");

        System.out.println("名字："+c.getName());
    }
}


class Category {

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int id;
    private String name;
}