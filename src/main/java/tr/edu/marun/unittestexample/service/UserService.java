/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.unittestexample.service;

import java.sql.SQLException;
import java.util.List;
import tr.edu.marun.unittestexample.model.User;

/**
 *
 * @author bamasyali
 */
public interface UserService {

    void insert(User user) throws SQLException;

    List<User> findAll() throws SQLException;
}
