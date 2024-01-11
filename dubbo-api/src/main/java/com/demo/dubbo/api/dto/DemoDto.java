package com.demo.dubbo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: huangzh
 * @Date: 2024/1/10 15:55
 * @Description: 添加描述
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DemoDto implements Serializable {

    private Integer id;

    private String name;

    private BigDecimal amount;

}
