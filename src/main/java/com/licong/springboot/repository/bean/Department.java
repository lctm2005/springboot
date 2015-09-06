package com.licong.springboot.repository.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author licong
 * @date 15-8-17
 */
@Data
public class Department {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    @JoinColumn(name = "parent_id")
    @OneToOne
    private Department parent;

}
