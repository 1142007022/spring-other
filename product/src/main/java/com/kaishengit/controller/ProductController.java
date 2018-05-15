package com.kaishengit.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.kaishengit.entitys.Product;
import com.kaishengit.service.ProductService;

@RequestMapping("/product")
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public String home(@RequestParam(defaultValue="1",required=false,name="p") Integer p,Model model) {
		PageInfo<Product> page = productService.findByPage(p);
		model.addAttribute("page", page);
		return "product/home";
	}
	
	@GetMapping("/add")
	public String add() {
		return "product/add";
	}
	
	@PostMapping("/add")
	public String add(@Valid Product product,BindingResult res) {
		productService.add(product);
		System.out.println(product.getStartTime());
		System.out.println(product.getEndTime());
		return "redirect:/product";
	}
	
	
	@GetMapping("/{id}")
	public String info(@PathVariable Integer id,Model model) {
		Product product =  productService.findById(id);
		model.addAttribute("product", product);
		return "product/buy";
		
	}
	
	
	
	
}
