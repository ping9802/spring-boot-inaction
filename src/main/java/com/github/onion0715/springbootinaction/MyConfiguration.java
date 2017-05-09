package com.github.onion0715.springbootinaction;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhwcong on 2017/5/10.
 */
@ConfigurationProperties("my")
@Configuration
public class MyConfiguration implements InitializingBean{

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(String.format("id=%s,name=%s",id,name));
    }
}
