package com.rz.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rz.springboot.dao.UserMapper;

@Service("userService")
@Transactional
public class UserService
{

	@Autowired
	private UserMapper mapper;

	public List<Map<String, Object>> findAll()
	{
		return mapper.findAll();
	}

	public List<Map<String, Object>> find()
	{
		return mapper.find();
	}
}
