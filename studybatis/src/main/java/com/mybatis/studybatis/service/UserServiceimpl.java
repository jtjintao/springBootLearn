package com.mybatis.studybatis.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.mybatis.studybatis.DAO.UserDao;
import com.mybatis.studybatis.entity.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceimpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public String getalluser(String sql) {
        System.out.println("sql:"+sql);
        List<Map> lists= userDao.selectAll(sql);
        lists.forEach(l->{
            System.out.println(l);
        });
        return lists.toString();
    }
}
