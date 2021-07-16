package com.example.demo.api.model.book;


import lombok.Data;

import java.io.Serializable;

/**
 * 书籍分类信息表实体类
 * @author heji-01
 */
@Data
public class BookClassDTO extends BookDTO implements Serializable {


    private static final long serialVersionUID = -6658967427022558192L;

    private String name;
}
