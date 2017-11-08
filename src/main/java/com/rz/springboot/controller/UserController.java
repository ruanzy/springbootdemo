package com.rz.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rz.springboot.service.UserService;

@RequestMapping("user")
@RestController
public class UserController
{
	@Autowired
	private UserService userService;

	@GetMapping("/all")
	public Object listAll()
	{
		List<Map<String, Object>> list = userService.findAll();
		return list;
	}

	@GetMapping("/kkk")
	public Object find()
	{
		List<Map<String, Object>> list = userService.find();
		return list;
	}
}
