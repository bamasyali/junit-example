/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.unittestexample.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.edu.marun.unittestexample.dao.UserDao;
import tr.edu.marun.unittestexample.model.User;

/**
 *
 * @author bamasyali
 */
public class UserDaoImpl implements UserDao {

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/test", "postgres", "1234");
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(User user) throws SQLException {
        try {
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO oop_user values (?);");
            stmt.setObject(1, user.getName());
            stmt.execute();
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<User> findAll() throws SQLException {

        List<User> users = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name FROM oop_user");

            while (rs.next()) {
                String name = rs.getString("name");
                users.add(new User(name));
            }
        } catch (SQLException e) {
            throw e;
        }

        return users;
    }
}
