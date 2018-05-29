package top.zgpv.dao.impl;

import top.zgpv.dao.UserDao;
import top.zgpv.exception.DuplicationOfRegistrationException;
import top.zgpv.pojo.User;

import java.io.*;

/**
 * The type User dao.
 */
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() throws IOException {
        File fd = new File("database");
        fd.mkdirs();
        File ff = new File(fd, "users.txt");
        ff.createNewFile();
    }

    @Override
    public boolean isLogin(String username, String password) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("database/users.txt"));

        boolean flag = false;

        while (br.ready()) {
            String[] split = br.readLine().split(",");
            if (split[0].equals(username) && split[1].equals(password)) {
                flag = true;
                break;
            }
        }
        br.close();

        return flag;
    }

    @Override
    public void registry(User user) throws IOException {
        String username = user.getUsername();
        String password = user.getPassword();
        boolean registryed = isRegistryed(username);
        if (registryed) {
            throw new DuplicationOfRegistrationException();
        } else {
            BufferedWriter bw = new BufferedWriter(new FileWriter("database/users.txt", true));
            bw.write(username + "," + password);
            bw.newLine();
            bw.close();
        }

    }

    @Override
    public boolean isRegistryed(String username) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("database/users.txt"));

        boolean flag = false;

        while (br.ready()) {
            String[] split = br.readLine().split(",");
            if (split[0].equals(username)) {
                flag = true;
                break;
            }
        }
        br.close();

        return flag;
    }
}
