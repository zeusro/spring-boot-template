package com.zeusro.exception;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * Error json view builder
 * <p/>
 * Created in 2018.04.26
 * <p/>
 *
 * @author <a href="http://zeusro.github.io/" style="background: #55a7e3;">Zeusro</a>
 */
public class ErrorJsonViewBuilder {

    static final String RESPONSE_TAG_CODE = "code";
    static final String RESPONSE_TAG_DATA = "data";
    static final String RESPONSE_TAG_IS_SUCCESS = "is_success";
    static final String RESPONSE_TAG_MSG = "msg";
    ModelAndView mv;

    public ErrorJsonViewBuilder() {
        init();
    }

    public ModelAndView build() {
        return mv;
    }

    private void init() {
        mv = new ModelAndView();
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        mv.setView(view);
        mv.addObject(RESPONSE_TAG_IS_SUCCESS, false);
    }

    public ErrorJsonViewBuilder setCode(String code) {
        mv.addObject(RESPONSE_TAG_CODE, code);
        return this;
    }

    public ErrorJsonViewBuilder setData(Object data) {
        mv.addObject(RESPONSE_TAG_DATA, data);
        return this;
    }

    public ErrorJsonViewBuilder setMsg(String msg) {
        mv.addObject(RESPONSE_TAG_MSG, msg);
        return this;
    }

}
