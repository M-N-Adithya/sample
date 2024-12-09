package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.ProductService;

@RestController
@RequestMapping("exam")
public class ClientController 
{
		@Autowired
		private ProductService service;
		
		@GetMapping("/")
		public String home()
		{
			return "I am in home page";
		}
		
		@GetMapping("viewall")
		public List<Object> getproducts()
		{
			return service.displayObjects();
		}
}
