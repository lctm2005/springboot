package com.licong.springboot.domain;

import com.licong.springboot.domain.bean.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author licong
 * @date 15-8-17
 */
@RestResource
@RepositoryRestResource(collectionResourceRel = "user", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {}
