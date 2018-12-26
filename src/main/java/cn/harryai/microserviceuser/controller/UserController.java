package cn.harryai.microserviceuser.controller;

import cn.harryai.microserviceuser.dao.UserRepository;
import cn.harryai.microserviceuser.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static final Logger LOGGER=LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne=this.userRepository.findOne(id);
        LOGGER.info("user is {}",findOne);
        return findOne;
    }

}
