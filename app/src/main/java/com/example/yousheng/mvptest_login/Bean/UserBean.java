package com.example.yousheng.mvptest_login.Bean;

/**
 * Created by yousheng on 17/4/11.
 */

/**
 * (1)首先我们需要一个UserBean，用来保存用户信息
 */
public class UserBean {
    private String user;
    private String password;

    public UserBean(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
