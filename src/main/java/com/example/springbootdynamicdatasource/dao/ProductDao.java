package com.example.springbootdynamicdatasource.dao;

import com.example.springbootdynamicdatasource.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductDao {
    Product select(@Param("id") long id);

    Integer update(Product product);

    Integer insert(Product product);

    Integer delete(long productId);

    List<Product> selectAll();
}
