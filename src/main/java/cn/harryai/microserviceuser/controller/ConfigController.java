package cn.harryai.microserviceuser.controller;

import cn.harryai.microserviceuser.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/envStr")
@RefreshScope
public class ConfigController {
    @Value("${env}")
    private String env;

    @Value("${user.id}")
    private String uid;
    @Autowired
    private UserConfig userConfig;

    @GetMapping("/print")
    public String pringEnv() {

        return this.env;

    }
    @GetMapping("/uid")
    public String pringUid() {

        return this.uid;

    }

    @GetMapping("/user")
    public String pringUser() {

        return String.format("name:%s,age:%d",userConfig.getName(),userConfig.getAge());

    }
}
