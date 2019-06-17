package com.weimingjia.dao;
/*
 *  @项目名：  vue_day01_user
 *  @包名：    com.weimingjia.dao
 *  @文件名:   UserDao
 *  @创建者:   魏铭佳牛逼
 *  @创建时间:  2019/6/17 9:02
 *  @描述：    TODO
 */

import com.weimingjia.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
