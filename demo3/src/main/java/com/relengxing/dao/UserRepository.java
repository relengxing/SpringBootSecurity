package com.relengxing.dao;

import com.relengxing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by relengxing on 2017/1/5.
 */
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsername(String username);

}
