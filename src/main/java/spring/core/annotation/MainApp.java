package spring.core.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService2 userService = context.getBean("personService2", UserService2.class);
        userService.save("Mohamed");
        context.close();
    }
}
