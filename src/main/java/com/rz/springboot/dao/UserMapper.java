package com.rz.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.rz.springboot.entity.User;

@Mapper
public interface UserMapper
{

	List<Map<String, Object>> findAll();
	
	@Select("select * FROM PURCHASE_ORDER")
	List<Map<String, Object>> find();
	
	@Select("select * FROM PURCHASE_ORDER")
	User findOne(@Param("name") String name);
}
