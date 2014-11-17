/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.unittestexample;

import java.sql.SQLException;
import java.util.List;
import tr.edu.marun.unittestexample.dao.UserDao;
import tr.edu.marun.unittestexample.dao.impl.UserDaoImpl;
import tr.edu.marun.unittestexample.model.User;

/**
 *
 * @author bamasyali
 */
public class Main {
    public static void main(String[] args) throws SQLException {
//        User user = new User("Burak");
//        
//        UserDao userDao = new UserDaoImpl();
//        
//        userDao.insert(user);
        
        UserDao userDao = new UserDaoImpl();
        
        List<User> users = userDao.findAll();
        
        for(User user : users){
            System.out.println(user.getName());
        }
        
        
    }
}
