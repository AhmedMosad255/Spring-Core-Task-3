package com.spring.core;

public class PersonService implements UserService {
    private final UserService userService;

    public PersonService(UserService userService) {
        this.userService = userService;
    }

    public void savePerson(String name) {
        userService.save(name);
    }

    @Override
    public void save(String name) {
        System.out.println("Saving " + name);
    }

    public void init() {
        System.out.println("Initializing");
    }

    public void destroy() {
        System.out.println("Destroying");
    }
}
