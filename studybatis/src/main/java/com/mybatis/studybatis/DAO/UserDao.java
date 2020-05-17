package com.mybatis.studybatis.DAO;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.studybatis.entity.User1;

import java.util.List;
import java.util.Map;

public interface UserDao {

    public List<Map> selectAll(String sql);
    public User1 select(Integer id);
    public Integer insert(User1 user1);
}
