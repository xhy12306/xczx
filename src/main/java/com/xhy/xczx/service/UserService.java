package com.xhy.xczx.service;


import com.xhy.xczx.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    List<User> findsAll();

    boolean insertUser(User user);

    boolean deleteUser(Integer id);

    boolean updateUser(User user);

    List<User> findByPage(Integer size, Integer page);
}
