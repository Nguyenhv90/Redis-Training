package com.hvn.SpringBootRedis.repository;

import com.hvn.SpringBootRedis.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {
    boolean saveUser(User user) throws Exception;

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUserById(Long id);
}
