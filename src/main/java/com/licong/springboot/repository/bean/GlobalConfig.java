package com.licong.springboot.repository.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by lctm2005 on 2015/6/20.
 */
@Data
@Entity
public class GlobalConfig {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String configKey;

    @Column(nullable = false)
    private String configValue;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
