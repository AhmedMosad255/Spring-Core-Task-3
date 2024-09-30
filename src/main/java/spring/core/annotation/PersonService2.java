package spring.core.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personService2")
public class PersonService2 implements UserService2 {

    private final UserService2 userService2;
    @Autowired
    public PersonService2(@Qualifier("userServiceImpl2") UserService2 userService2) {
        this.userService2 = userService2;
    }

    @Override
    public void save(String name) {
        userService2.save(name);
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying");
    }
}
