package com.example.demo.mybatis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")

public class RedisController {


    @Autowired(required=false)
    private RedisTemplate redisTemplate;

    @RequestMapping("/set")
    public  String setRedis(String value){
        redisTemplate.opsForValue().set("herb" , value);
        return  "储存成功：" + value;
    }

    @RequestMapping("/get")
    public String getRedis(){
        Object  obj = redisTemplate.opsForValue().get("herb");
         if (null != obj){
             return String.valueOf(obj);
         }
         return "缓存失败";
    }
}
