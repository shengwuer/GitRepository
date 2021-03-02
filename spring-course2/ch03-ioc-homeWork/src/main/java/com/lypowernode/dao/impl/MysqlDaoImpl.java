package com.lypowernode.dao.impl;

import com.lypowernode.dao.UserDao;
import com.lypowernode.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class MysqlDaoImpl implements UserDao {

    @Override
    public void insertUser(SysUser user) {

        System.out.println("user插入到mysql数据库");
    }
}
