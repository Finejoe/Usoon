package com.project.usoon.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.usoon.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
