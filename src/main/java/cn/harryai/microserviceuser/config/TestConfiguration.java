package cn.harryai.microserviceuser.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "microservice-user", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
