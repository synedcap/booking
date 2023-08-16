package com.example.renthouse.Service;

import com.example.renthouse.Entity.User;
import com.example.renthouse.Request.UserRequest;

public interface UserService {

    User addUser(UserRequest userRequest);
}
