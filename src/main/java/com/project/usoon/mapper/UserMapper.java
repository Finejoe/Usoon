package com.project.usoon.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.usoon.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
