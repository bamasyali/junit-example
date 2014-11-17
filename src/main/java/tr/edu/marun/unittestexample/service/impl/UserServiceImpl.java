/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.unittestexample.service.impl;

import java.sql.SQLException;
import java.util.List;
import tr.edu.marun.unittestexample.dao.UserDao;
import tr.edu.marun.unittestexample.model.User;
import tr.edu.marun.unittestexample.service.UserService;

/**
 *
 * @author bamasyali
 */
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insert(User user) throws SQLException {
        this.userDao.insert(user);
    }

    @Override
    public List<User> findAll() throws SQLException {
        return this.userDao.findAll();
    }

}
