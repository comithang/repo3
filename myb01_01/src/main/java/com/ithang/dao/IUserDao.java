package com.ithang.dao;
import com.ithang.domain.User;

import java.util.List;

/*
* User的持久化接口
* */
public interface IUserDao {
    /*
    * 查询所有操作
    * */
    List<User> findAll();
}
