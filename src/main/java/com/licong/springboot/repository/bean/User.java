package com.licong.springboot.repository.bean;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

/**
 * @author licong
 * @date 15-8-17
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    @JoinColumn(name = "department_id")
    @OneToOne
    private Department department;
}
