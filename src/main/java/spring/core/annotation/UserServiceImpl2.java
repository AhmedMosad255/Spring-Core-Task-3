package spring.core.annotation;

import org.springframework.stereotype.Component;

@Component("userServiceImpl2")
public class UserServiceImpl2 implements UserService2 {
    @Override
    public void save(String name) {
        System.out.println("UserServiceImpl2 Saving " + name);
    }
}
