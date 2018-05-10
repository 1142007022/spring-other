package com.kaishengit.service;

import com.github.pagehelper.PageInfo;
import com.kaishengit.entitys.User;


public interface UserService {

	User findById(Integer id);

	PageInfo findAll(Integer p);

}
