package com.demo.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.api.dto.DemoDto;
import com.demo.dubbo.api.service.DemoService;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @Author: huangzh
 * @Date: 2024/1/10 17:02
 * @Description: 添加描述
 */
@Service(version = "2.6.2")
public class DemoServiceImpl implements DemoService {

    @Override
    public DemoDto getDemoDto(Integer id) {
        DemoDto demoDto = new DemoDto();
        DemoDto dto = demoDto.builder().id(new Random().nextInt(100) + 1).name("zhang").amount(new BigDecimal("700.20")).build();
        return dto;
    }
}
