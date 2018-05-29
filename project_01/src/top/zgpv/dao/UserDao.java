package top.zgpv.dao;

import top.zgpv.pojo.User;

import java.io.IOException;

/**
 * 这是针对用户操作的接口
 *
 * @author guoping
 * @version 0.0.2
 */
public interface UserDao {
    /**
     * Is login boolean.
     *
     * @param username the 用户名
     * @param password the 密码
     * @return the boolean
     */
    public abstract boolean isLogin(String username, String password) throws IOException;

    /**
     * Registry.
     *
     * @param user the User对象
     */
    public abstract void registry(User user) throws IOException;

    public abstract boolean isRegistryed(String username) throws IOException;
}
