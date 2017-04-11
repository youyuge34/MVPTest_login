package com.example.yousheng.mvptest_login.Model;

import android.util.SparseArray;

import com.example.yousheng.mvptest_login.Bean.UserBean;

/**
 * Created by yousheng on 17/4/11.
 */

/**
 * 数据存储的模型层，只需要考虑怎么把数据存起来
 */
public class UserModel implements IUserModel {
    //android的优化版hashmap，数据千条以下的时候效率高
    private SparseArray<UserBean> array=new SparseArray<>();

    @Override
    public void saveUser(int id, String name, String password) {
        //存入array
        array.append(id,new UserBean(name,password));
    }

    @Override
    public UserBean loadUser(int id) {
        if(array.indexOfKey(id)>=0) {
            return array.get(id);
        }else return null;
    }
}
