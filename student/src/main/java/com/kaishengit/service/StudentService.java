package com.kaishengit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaishengit.entitys.Student;
import com.kaishengit.mapper.StudentMapper;

@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	public PageInfo findByPage(Integer p) {
		PageHelper.startPage(p, 10);
		List<Student> lists = studentMapper.selectByExample(null);
		return new PageInfo<>(lists);
	}

	public void addStudent(Student student) {
		studentMapper.insertSelective(student);
	}

	public Student findById(Integer id) {
		return studentMapper.selectByPrimaryKey(id);
	}

	public void update(Student student) {
		studentMapper.updateByPrimaryKeySelective(student);
	}

	public void delById(Integer id) {
		studentMapper.deleteByPrimaryKey(id);
	}

	

}
