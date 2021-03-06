package com.example.demo.mybatis.mapper;


import com.example.demo.mybatis.entity.BookDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    /**
     * @return
     */
    List<BookDTO> findAll();

    BookDTO findById(int id);

    List<BookDTO> findByName(String name);
}
