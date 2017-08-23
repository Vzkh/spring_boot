package com.zk.mapper.mysql;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zk.model.User;

@Mapper
public interface UserMapper {

	/**
	 * 保存对象
	 * 
	 * @param user
	 * @return
	 */
	@Insert("insert into user(username,password) VALUES(#{user.username},#{user.password})")
	int saveUser(@Param("user") User user);
}
