package com.project.usoon.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.usoon.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
