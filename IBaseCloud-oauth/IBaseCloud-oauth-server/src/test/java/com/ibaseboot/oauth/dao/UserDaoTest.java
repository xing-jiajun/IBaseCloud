package com.ibaseboot.oauth.dao;

import com.ibasecloud.security.SecurityApplicationTest;
import com.ibasecloud.oauth.common.table.TbUser;
import com.ibaseboot.oauth.dao.table.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoTest extends SecurityApplicationTest {

    @Autowired
    UserDao userDao;

    @Test
    public void test () {
        List<TbUser> objects = userDao.selectList(null);
        System.out.println(objects);
    }
}
