package cn.harryai.microserviceuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//过滤指定类不被扫描
//@ComponentScan(excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = RibbonConfiguration.class),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = TestConfiguration.class)
//})
public class MicroserviceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceUserApplication.class, args);
    }

}

