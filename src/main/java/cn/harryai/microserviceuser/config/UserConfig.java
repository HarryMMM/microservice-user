package cn.harryai.microserviceuser.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Component
@ConfigurationProperties("user")
@RefreshScope
public class UserConfig {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}


