package com.project.usoon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.usoon.entity.User;
import com.project.usoon.mapper.UserMapper;
import com.project.usoon.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
