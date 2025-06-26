package com.example.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private final HelloClass helloClass;

    public MyFirstService(HelloClass helloClass) {
        this.helloClass = helloClass;
    }

    public String tell() {
        return "Hello from MyFirstService: " + helloClass.hello();
    }
}
