package com.example.yousheng.mvptest_login.Model;

/**
 * Created by yousheng on 17/4/11.
 */

import com.example.yousheng.mvptest_login.Bean.UserBean;

/**
 * (3)Model接口：
 * 同样，Model也需要对这三个字段进行读写操作，并存储在某个载体内(这不是我们所关心的，
 * 可以存在内存、文件、数据库或者远程服务器，但对于Presenter及View无影响),定义IUserModel接口：
 */
public interface IUserModel {
    void saveUser(int id,String name,String password);
    UserBean loadUser(int id);
}
