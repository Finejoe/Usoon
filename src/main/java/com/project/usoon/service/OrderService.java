package com.project.usoon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.usoon.entity.Orders;

public interface OrderService extends IService<Orders> {

    public void submit(Orders orders);

}
