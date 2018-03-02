package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MajorDao extends CrudRepository<Major, Long> {
    List<Major> findTop10ByNameOrderByIdDesc(String name);


}
