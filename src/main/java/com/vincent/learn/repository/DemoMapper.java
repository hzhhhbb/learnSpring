package com.vincent.learn.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoMapper {

    @Select("select name from demo where id=#{id}")
    String FindById(Integer id);
}
