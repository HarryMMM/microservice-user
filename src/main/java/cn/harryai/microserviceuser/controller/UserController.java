package cn.harryai.microserviceuser.controller;

import cn.harryai.microserviceuser.dao.UserRepository;
import cn.harryai.microserviceuser.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findOne(id);
        LOGGER.info("user is {}", findOne);
        return findOne;
    }

    @GetMapping("/get-multi-param")
    public String get(String firstParam, Long secondParam) {
        LOGGER.info("first param is {},second param is {}", firstParam, secondParam);
        return "success";
    }


    @PostMapping("/post-multi-param")
    public String post(String firstParam, Long secondParam, Date thirdParam) {
        LOGGER.info("first param is {},second param is {},third param is {}", firstParam, secondParam, thirdParam);
        return "success";
    }



    @PostMapping("/post-multi-param2")
    public String post2(@RequestBody User user) {
        LOGGER.info("this user is {}",user);
        return "success";
    }

}
