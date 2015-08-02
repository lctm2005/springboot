package com.licong.springboot.repository;

import com.licong.springboot.repository.bean.GlobalConfig;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by lctm2005 on 2015/6/20.
 */
@RepositoryRestResource(collectionResourceRel = "globalConfig", path = "globalConfig")
public interface GlobalConfigRepository extends PagingAndSortingRepository<GlobalConfig, Long> {

    List<GlobalConfig> findByConfigKey(@Param("configKey") String configKey);

}
