package com.zeusro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Example spring boot application
 * <p/>
 * Created in 2018.08.30
 * <p/>
 *
 * @author <a href="https://zeusro.github.io/" style="background: #55a7e3;">Zeusro</a>
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ExampleSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleSpringBootApplication.class, args);
    }
}
