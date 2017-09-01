import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
//        通过String数组
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext.xml" });
//        单纯通过文件名
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Category c = (Category) context.getBean("d");

        System.out.println("名字："+c.getName());
        System.out.println("Baby："+c.getBaby().getName());

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
    private Baby baby;

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }
}

class Baby {

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
}