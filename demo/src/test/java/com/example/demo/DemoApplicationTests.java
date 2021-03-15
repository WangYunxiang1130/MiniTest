package com.example.demo;

import com.example.demo.practice.Convert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() throws ClassNotFoundException {
        int testTimes = 100;
        int maxLength = 10;
        int mode = 1; // 1 represent 0-9， 2 represent 0-99

        // generate test input
//        System.out.println();
        for (int i = 0; i < testTimes; i++) {
            int length = (int) (Math.random() * maxLength + 1);
            int[] input = new int[length];
            int temp;
            for (int j = 0; j < length; j++) {
                if (mode == 1) {
                    temp = (int) (Math.random() * 10);
                } else {
                    temp = (int) (Math.random() * 100);
                }
                input[j] = temp;
            }
            Convert.convert(input);
            System.out.println();
        }
    }
}
