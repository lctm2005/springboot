package com.licong.springboot.repository.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lctm2005 on 2015/6/20.
 */
@Entity
public class GlobalConfig {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String configKey;

    @Column(nullable = false)
    private String configValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
