package com.kaishengit.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kaishengit.entitys.User;

@Mapper
public interface UserMapper {

	User findById(Integer id);

}
