package com.zeusro.config;

import com.zeusro.exception.ApplicationExceptionResolver;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Global exception handler
 * <p/>
 * Created in 2018.08.30
 * <p/>
 *
 * @author <a href="https://zeusro.github.io/" style="background: #55a7e3;">Zeusro</a>
 */
@EnableWebMvc
@Configuration
@ComponentScan
public class GlobalExceptionHandler implements WebMvcConfigurer {


    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        exceptionResolvers.add(new ApplicationExceptionResolver());
    }
}
