package org.allen.service;

import org.allen.api.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "student")
public interface StudentService {

    int add(Student student);

    @CachePut(key = "#p0.sno")
    int update(Student student);

    @CacheEvict(key = "#p0", allEntries = true)
    int deleteBysno(String sno);

    @Cacheable(key = "#p0")
    Student queryStudentBySno(String sno);

}
