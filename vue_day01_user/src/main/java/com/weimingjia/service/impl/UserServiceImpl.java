package com.weimingjia.service.impl;
/*
 *  @项目名：  vue_day01_user
 *  @包名：    com.weimingjia.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   魏铭佳牛逼
 *  @创建时间:  2019/6/17 9:04
 *  @描述：    TODO
 */

import com.weimingjia.dao.UserDao;
import com.weimingjia.domain.User;
import com.weimingjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDao.findOne(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }
}
