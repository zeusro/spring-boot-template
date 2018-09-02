package com.zeusro.exception;

import org.apache.http.entity.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Application exception resolver
 * <p/>
 * Created in 2018.08.30
 * <p/>
 *
 * @author <a href="https://zeusro.github.io/" style="background: #55a7e3;">Zeusro</a>
 */

public class ApplicationExceptionResolver implements HandlerExceptionResolver {

    static final Logger logger = LoggerFactory.getLogger(ApplicationExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {


        ErrorJsonViewBuilder builder = new ErrorJsonViewBuilder();
        response.setContentType(ContentType.APPLICATION_JSON.getMimeType());
        response.setCharacterEncoding(ContentType.APPLICATION_JSON.getCharset().toString());
        if (e instanceof HttpRequestMethodNotSupportedException) {
            builder.setCode(e.getClass().getName());
            builder.setMsg(e.getMessage());
            return builder.build();
        }
        //自定义业务异常处理
//        if (e instanceof XXXException) {
//
//        }
        logger.warn("{}{}{}", e.getMessage(), e.getClass().getName(), e);
        builder.setCode(e.getClass().getName());
        builder.setMsg(e.getMessage());
        //fixme:不应该把异常暴露出去,这里只是为了方便调试
        builder.setData(e);
        return builder.build();
    }
}
