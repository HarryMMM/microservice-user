package cn.harryai.microserviceuser.dao;

import cn.harryai.microserviceuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
