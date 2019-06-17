package com.weimingjia.controller;

import com.weimingjia.domain.User;
import com.weimingjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *  @项目名：  vue_day01_user
 *  @包名：    com.weimingjia.controller
 *  @文件名:   UserController
 *  @创建者:   魏铭佳牛逼
 *  @创建时间:  2019/6/17 9:07
 *  @描述：    TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findOne/{id}")
    public User findOne(@PathVariable("id")Integer id){
        return userService.findOne(id);
    }

    @RequestMapping("/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }

}
