package com.tang.read_write.controller;

import com.tang.read_write.domain.Orders;
import com.tang.read_write.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Classname OrderController
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/23 19:15
 * @Created by ASUS
 */
@RestController
public class OrderController {


    @Resource
    private OrderService orderService;

    @GetMapping("/order")
    public String order(Integer i) {

        Orders order = new Orders();

        order.setName("new xxx");
        order.setOrderCreatetime(new Date());
        order.setOrderState(1);
        order.setOrderMoney(10.0);
        order.setCommodityId(30);

        orderService.add(order,i);

        return "success";
    }

}