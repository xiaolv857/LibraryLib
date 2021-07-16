package com.example.demo.mybatis.controller;


import com.example.demo.mybatis.entity.BookDTO;
import com.example.demo.mybatis.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired(required=false)
    private BookMapper bookMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/findAll")
    public List<BookDTO> findAll() {
        return bookMapper.findAll();

    }

    @RequestMapping("/findByCache")
    public List<BookDTO> findByCache() {
        //优先取缓存数据
       Object obj = redisTemplate.opsForValue().get("demo-book-findByCache");
       if (null != obj){
           System.out.println("走缓存");
           return (List<BookDTO>) obj;
       }
       //缓存为空，重新查找且缓存
        System.out.println("走DB");
        List<BookDTO> localList = bookMapper.findAll();
        redisTemplate.opsForValue().set("demo-book-findByCache",localList);
        return localList;

    }


    @RequestMapping("/clearCache")
    public String clearCache() {
        //优先取缓存数据
        Object obj = redisTemplate.opsForValue().get("demo-book-findByCache");
        if (null != obj){
           redisTemplate.delete("demo-book-findByCache");
           return "缓存非空，已成功删除";
        }
        return "缓存为空，无需操作";
    }
}
