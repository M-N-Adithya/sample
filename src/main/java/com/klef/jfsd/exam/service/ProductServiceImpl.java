package com.klef.jfsd.exam.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<Object> displayObjects() {
		Object[] products = restTemplate.getForObject("https://fakestoreapi.com/products", Object[].class);
		return Arrays.asList(products);
	}

}
