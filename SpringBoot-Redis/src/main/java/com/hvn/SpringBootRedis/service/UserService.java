package com.hvn.SpringBootRedis.service;

import com.hvn.SpringBootRedis.dto.User;

import java.util.List;

public interface UserService {

    boolean saveUser(User user) throws Exception;

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUserById(Long id);
}
