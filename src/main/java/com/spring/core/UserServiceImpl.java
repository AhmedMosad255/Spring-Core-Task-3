package com.spring.core;

public class UserServiceImpl implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Saving " + name);
    }
}
