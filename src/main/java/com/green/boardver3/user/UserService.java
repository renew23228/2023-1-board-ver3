package com.green.boardver3.user;

import com.green.boardver3.user.model.UserInsEntity;
import com.green.boardver3.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper MAPPER;
    private final CommonUtils commonUtils;

    @Autowired
    public UserService(UserMapper mapper, CommonUtils commonUtils) {

        this.MAPPER = mapper;
        this.commonUtils = commonUtils;
    }

    public int postUser(UserInsEntity entity) {
        //비밀번호 암호화
        String hashPw = commonUtils.encodeSha256(entity.getUpw());
        entity.setUpw(hashPw);
        return MAPPER.insUser(entity);
    }
}
