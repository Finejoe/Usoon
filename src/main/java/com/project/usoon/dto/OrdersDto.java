package com.project.usoon.dto;

import com.project.usoon.entity.OrderDetail;
import com.project.usoon.entity.Orders;
import lombok.Data;
import java.util.List;

@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;
	
}
