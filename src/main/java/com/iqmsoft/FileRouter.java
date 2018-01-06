package com.iqmsoft;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class FileRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:target/input?noop=true")
                .to("file:target/output");
    }
}
