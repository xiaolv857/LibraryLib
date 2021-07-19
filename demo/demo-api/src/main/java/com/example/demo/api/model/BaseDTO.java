package com.example.demo.api.model;

import com.example.demo.api.enums.ValidFlagEnum;
import lombok.Data;

/**
 * 实体类父类
 */
public class BaseDTO {

    private int id;

    private String temp1;

    private String temp2;

    private Data createDate;

    private Data updateDate;

    private ValidFlagEnum validFlag;


}
