package com.lypowernode.dao.impl;

import com.lypowernode.dao.UserDao;
import com.lypowernode.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDaoImpl implements UserDao {

    @Override
    public void insertUser(SysUser user) {
        System.out.println("插入Oracle数据库成功" );

    }
}
