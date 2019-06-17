package com.weimingjia.service;
/*
 *  @项目名：  vue_day01_user
 *  @包名：    com.weimingjia.service
 *  @文件名:   UserService
 *  @创建者:   魏铭佳牛逼
 *  @创建时间:  2019/6/17 9:03
 *  @描述：    TODO
 */

import com.weimingjia.domain.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User findOne(int id);

    public void update(User user);

}
