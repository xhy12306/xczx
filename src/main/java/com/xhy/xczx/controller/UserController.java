package com.xhy.xczx.controller;

import com.xhy.xczx.pojo.User;
import com.xhy.xczx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/findsAll", method = RequestMethod.GET)
    public List<User> findsAll() {
        return userService.findsAll();
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public boolean insertUser(User user) {
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public boolean deleteUser(Integer id) {
        return userService.deleteUser(id);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public boolean updateUser(User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/findByPage/{size}/{page}", method = RequestMethod.GET)
    public List<User> findByPage(@PathVariable Integer size, @PathVariable Integer page) {
        return userService.findByPage(size, page);
    }
}
