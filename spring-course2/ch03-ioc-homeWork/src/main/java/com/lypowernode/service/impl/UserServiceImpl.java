package com.lypowernode.service.impl;

import com.lypowernode.dao.UserDao;
import com.lypowernode.domain.SysUser;
import com.lypowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    //引用类型数据

  /*spring注解
    @Autowired
    @Qualifier("oracleDao")*/
    // jdk的注解

    @Resource(name = "mysqlDao")
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(SysUser user) {

        //处理数据,调用Dao的方法
        //调用dao的方法
        dao.insertUser(user);

    }
}
