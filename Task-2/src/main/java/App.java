import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем бин HelloWorld и выводим сообщение
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());

        // Получаем бин Cat дважды и сравниваем их
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        // Проверяем, являются ли оба бина HelloWorld одинаковыми по ссылке
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("являются ли оба бина HelloWorld одинаковыми по ссылке: " + (helloWorld1 == helloWorld2));

        // Проверяем, являются ли оба бина Cat одинаковыми по ссылке
        System.out.println("являются ли оба бина Cat одинаковыми по ссылке: " + (cat1 == cat2));
    }
}