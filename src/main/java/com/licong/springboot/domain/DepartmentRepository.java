package com.licong.springboot.domain;

import com.licong.springboot.domain.bean.Department;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author licong
 * @date 15-8-17
 */
@RestResource
@RepositoryRestResource(collectionResourceRel = "departments", path = "departments")
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Integer> {
}
