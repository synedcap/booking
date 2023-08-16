package com.example.renthouse.Service.Impl;

import com.example.renthouse.Entity.User;
import com.example.renthouse.Repository.UserRepository;
import com.example.renthouse.Request.UserRequest;
import com.example.renthouse.Service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public User addUser(UserRequest userRequest) {

        User user = modelMapper.map(userRequest,User.class);
        User userSaved = userRepository.save(user);
        return userSaved;
    }
}
