/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.unittestexample.test.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tr.edu.marun.unittestexample.dao.UserDao;
import tr.edu.marun.unittestexample.model.User;

/**
 *
 * @author bamasyali
 */
public class UserDaoMock implements UserDao {

    private final List<User> users;

    public UserDaoMock() {
        this.users = new ArrayList<>();
    }

    @Override
    public void insert(User user) throws SQLException {
        if (users.contains(user)) {
            throw new SQLException("Duplicate Data");
        }
        users.add(user);
    }

    @Override
    public List<User> findAll() throws SQLException {
        return users;
    }

}
