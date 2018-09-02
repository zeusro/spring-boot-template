package com.zeusro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring boot application test
 * <p/>
 * Created in 2018.08.30
 * <p/>
 *
 * @author <a href="https://zeusro.github.io/" style="background: #55a7e3;">Zeusro</a>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootApplicationTest {


    @Test
    public void testRun() {
        System.out.println("hello web");
    }
}
