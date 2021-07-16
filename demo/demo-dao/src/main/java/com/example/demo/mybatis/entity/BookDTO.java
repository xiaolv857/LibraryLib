package com.example.demo.mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 书实体类
 */

@Data
public class BookDTO implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 书名
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 作者
     */
    private String author;
}
