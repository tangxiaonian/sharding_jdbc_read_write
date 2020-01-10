package com.tang.read_write.service;


import com.tang.read_write.domain.Stock;
import com.tang.read_write.mapper.StockMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname StockService
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/24 18:24
 * @Created by ASUS
 */
@Service
public class StockService {

    @Resource
    private StockMapper stockMapper;

    public Stock selectById() {

        return stockMapper.selectByPrimaryKey(1);

    }

}