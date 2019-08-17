package com.xhy.xczx.dao;

import com.xhy.xczx.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//扫描mapper下的文件
@Repository
public interface UserDao {

	 List<User> findAll();

	@Select("select id,name,age from t_user")
	List<User> findsAll();

	@Insert("insert into t_user(id,name,age) values(#{id},#{name},#{age})")
	boolean insertUser(User user);

	@Delete("delete from t_user where id =#{id}")
	boolean deleteUser(Integer id);

	@Update("update t_user set name=#{name},age=#{age} where id=#{id}")
	boolean updateUser(User user);

	@Select("select id,name,age from t_user limit #{size},#{page}")
	List<User> findByPage(Integer size, Integer page);
}





