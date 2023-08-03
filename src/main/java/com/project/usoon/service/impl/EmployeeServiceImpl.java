package com.project.usoon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.usoon.entity.Employee;
import com.project.usoon.mapper.EmployeeMapper;
import com.project.usoon.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
