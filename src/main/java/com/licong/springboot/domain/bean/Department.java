package com.licong.springboot.domain.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author licong
 * @date 15-8-17
 */
@Data
@Entity
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
