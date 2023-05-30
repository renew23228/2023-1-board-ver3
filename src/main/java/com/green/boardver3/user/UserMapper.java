package com.green.boardver3.user;

import com.green.boardver3.user.model.UserInsEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsEntity entity);

}
