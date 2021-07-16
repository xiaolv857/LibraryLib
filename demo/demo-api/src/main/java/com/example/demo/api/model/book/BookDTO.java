package com.example.demo.api.model.book;

import com.example.demo.api.model.BaseDTO;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 书籍实体类
 * @author heji-01
 */
@Data

public class BookDTO extends BaseDTO implements Serializable {


    private static final long serialVersionUID = -4905279642002997669L;

    private String bookName;

    private int bookClassId;

    private BigDecimal bookPrice;

    private  String bookPublish;

    private  String bookAuthor;

    private  String bookImg;

    private  Data publishDate;


}
