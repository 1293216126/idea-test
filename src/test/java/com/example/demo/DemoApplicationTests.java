package com.example.demo;

import com.example.demo.demos.web.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        User user=new User();
        System.out.println("user = " + user.getName()+user.getAge());
    }

    public static void main(String[] args) {
        DemoApplicationTests applicationTests=new DemoApplicationTests();
        applicationTests.contextLoads();
    }

}
