package com.licong.springboot.web;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author licong
 * @date 15-9-7
 */
@Component
public class AppHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.up().withDetail("my", 1).build();
    }
}
