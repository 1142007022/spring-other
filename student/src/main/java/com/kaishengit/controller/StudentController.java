package com.kaishengit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.kaishengit.controller.result.Result;
import com.kaishengit.entitys.Student;
import com.kaishengit.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public PageInfo home(@RequestParam(defaultValue="1",required=false,name="p")Integer p) {
		return studentService.findByPage(p);
	}
	
	@PostMapping("/new")
	public Result newStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return Result.success();
	}
	
	
	@GetMapping("/{id}")
	public Student findById(@PathVariable Integer id) {
		return studentService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Result upDate(@RequestBody Student student) {
		studentService.update(student);
		return  Result.success();
	}
	
	@DeleteMapping("/{id}")
	public Result delById(@PathVariable Integer id) {
		studentService.delById(id);
		return Result.success();
	}
	
	
}
