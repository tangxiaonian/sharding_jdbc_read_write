package com.tang.read_write.service;

import com.tang.read_write.domain.Orders;
import com.tang.read_write.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Classname OrderService
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/24 17:00
 * @Created by ASUS
 */
@Service
public class OrderService {

    @Resource
    public OrderMapper orderMapper;

    @Transactional
    public void add(Orders order, Integer i) {

        orderMapper.insert(order);

        int a = 1 / i;

    }

}