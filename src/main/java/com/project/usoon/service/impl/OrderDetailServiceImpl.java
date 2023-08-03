package com.project.usoon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.usoon.entity.OrderDetail;
import com.project.usoon.mapper.OrderDetailMapper;
import com.project.usoon.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
