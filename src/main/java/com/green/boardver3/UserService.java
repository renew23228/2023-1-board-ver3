package com.green.boardver3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
