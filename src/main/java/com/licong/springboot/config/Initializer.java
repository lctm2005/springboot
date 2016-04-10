package com.licong.springboot.config;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by lctm2005 on 2015/10/6.
 */
public class Initializer extends AbstractHttpSessionApplicationInitializer {

    public Initializer() {
        super(HttpSessionConfig.class);
    }
}
