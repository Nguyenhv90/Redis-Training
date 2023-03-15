package com.hvn.SpringBootRedis.service;

import com.hvn.SpringBootRedis.dto.User;
import com.hvn.SpringBootRedis.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserserviceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public boolean saveUser(User user) throws Exception {
        return userRepository.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userRepository.fetchAllUser();
    }

    @Override
    public User fetchUserById(Long id) {
        return userRepository.fetchUserById(id);
    }

    @Override
    public boolean deleteUserById(Long id) {
        return userRepository.deleteUserById(id);
    }
}
