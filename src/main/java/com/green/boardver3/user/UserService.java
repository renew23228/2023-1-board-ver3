package com.green.boardver3.user;

import com.green.boardver3.user.model.UserInsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper MAPPER;

    @Autowired
    public UserService(UserMapper mapper) {
        this.MAPPER = mapper;
    }

    public int postUser(UserInsEntity entity) {
        return MAPPER.insUser(entity);
    }
}
