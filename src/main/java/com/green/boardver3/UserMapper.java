package com.green.boardver3;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsEntity entity);




}
