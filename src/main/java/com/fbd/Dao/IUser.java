package com.fbd.Dao;

import com.fbd.domain.User;

import java.util.List;

/**
 * 用户的持久层操作
 */
public interface IUser {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

}
