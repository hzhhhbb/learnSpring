package com.vincent.learn.controller;

import com.vincent.learn.repository.DemoMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(path = "demo")
public class DemoController {

    @Resource
    private DemoMapper demoMapper;

    @GetMapping("/{id}")
    public String getName(@PathVariable Integer id){
        return demoMapper.FindById(id);
    }
}
