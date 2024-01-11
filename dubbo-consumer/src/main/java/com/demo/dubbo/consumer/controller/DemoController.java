package com.demo.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.api.dto.DemoDto;
import com.demo.dubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @Author: huangzh
 * @Date: 2024/1/10 16:18
 * @Description: 添加描述
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @Reference(version = "2.6.2", check = false)
    private DemoService service;

    @GetMapping("/getDemoDto")
    public String getDemoDto(@RequestParam Integer id, HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            System.out.println(headerName + ": " + headerValue);
        }
        DemoDto demoDto = service.getDemoDto(id);

        if (demoDto != null) {
            return demoDto.toString();
        }
        return "not find data";
    }
}
