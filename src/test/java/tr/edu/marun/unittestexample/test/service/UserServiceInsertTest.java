/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.unittestexample.test.service;

import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import tr.edu.marun.unittestexample.model.User;
import tr.edu.marun.unittestexample.test.BaseUnitTest;

/**
 *
 * @author bamasyali
 */
public class UserServiceInsertTest extends BaseUnitTest {

    @Before
    public void prepareTestData() throws SQLException {
        userService.insert(new User("Burak"));
    }

    @Test
    public void insertSuccessTest() throws SQLException {
        userService.insert(new User("Ahmet"));
    }

    @Test(expected = SQLException.class)
    public void insertFailTest() throws SQLException {
        userService.insert(new User("Burak"));
    }
}
