package com.pg.book;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BookApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("test启动了");
    }

}
