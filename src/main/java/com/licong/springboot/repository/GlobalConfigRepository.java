package com.licong.springboot.repository;

import com.licong.springboot.repository.bean.GlobalConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by lctm2005 on 2015/6/20.
 */

@RestResource(exported = false) //findAll(…) methods was not exported
@RepositoryRestResource(collectionResourceRel = "globalConfig", path = "globalConfig")
public interface GlobalConfigRepository extends PagingAndSortingRepository<GlobalConfig, Integer> {

    public List<GlobalConfig> findByConfigKey(@Param("configKey") String configKey);

}