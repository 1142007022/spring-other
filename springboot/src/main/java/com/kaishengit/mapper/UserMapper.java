package com.kaishengit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kaishengit.entitys.User;

@Mapper
public interface UserMapper {

	User findById(Integer id);

	List<User> findAll();

}
