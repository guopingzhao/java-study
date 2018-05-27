package top.zgpv.dao.impl;

import top.zgpv.dao.UserDao;
import top.zgpv.pojo.User;

import java.util.ArrayList;

/**
 * The type User dao.
 */
public class UserDaoImpl implements UserDao {
    private static ArrayList<User> users = new ArrayList<>();

    @Override
    public boolean isLogin(String username, String password) {
        boolean flag = false;
        for (User user : users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void registry(User user) {
        this.users.add(user);
    }
}
