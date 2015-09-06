package com.licong.springboot.domain.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lctm2005 on 2015/6/20.
 */
@Data
@Entity
public class GlobalConfig {

    @Id
    @GeneratedValue
    private Long id;

    @Column( nullable = false)
    private String configKey;

    @Column(nullable = false)
    private String configValue;
}
