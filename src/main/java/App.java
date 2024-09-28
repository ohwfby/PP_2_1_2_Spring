import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat =
                (Cat) applicationContext.getBean("meow");
        Cat beanCat1 =
                (Cat) applicationContext.getBean("meow");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(bean.equals(bean1));
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat.equals(beanCat1));

    }
}