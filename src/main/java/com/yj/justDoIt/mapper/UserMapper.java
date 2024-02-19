package com.yj.justDoIt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yj.justDoIt.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper  extends BaseMapper<User> {

//    public User getUserByUsername(String username);
}
