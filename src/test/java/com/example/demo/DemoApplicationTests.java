package com.example.demo;

import com.example.demo.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
    Person person;

    @Autowired
    ApplicationContext app;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testHelloService(){
        System.out.println(app.containsBean("helloService"));
    }


}
