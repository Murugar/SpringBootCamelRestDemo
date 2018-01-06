package com.iqmsoft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myBean")
public class SampleBean {
    @Value("${greeting}")
    private String say;

    @Value("${greeting2}")
    private String say2;

    public String saySomething(){
        return say;
    }

    public String saySomething2(){
        return say2;
    }
}
