package com.kaishengit.service;

import com.github.pagehelper.PageInfo;
import com.kaishengit.entitys.Product;

public interface ProductService {

	PageInfo<Product> findByPage(Integer p);

	void add(Product product);

	Product findById(Integer id);

}
