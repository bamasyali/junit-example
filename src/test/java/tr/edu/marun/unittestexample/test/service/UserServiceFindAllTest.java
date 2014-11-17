/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.unittestexample.test.service;

import java.sql.SQLException;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tr.edu.marun.unittestexample.model.User;
import tr.edu.marun.unittestexample.test.BaseUnitTest;
import static org.junit.Assert.*;

/**
 *
 * @author bamasyali
 */
public class UserServiceFindAllTest extends BaseUnitTest {

    @Before
    public void prepareTestData() throws SQLException {
        userService.insert(new User("Burak"));
    }

    @Test
    public void findAllSuccessTest() throws SQLException {
        List<User> users = userService.findAll();
        assertEquals(1, users.size());

        User user = users.get(0);
        assertEquals("Burak", user.getName());
    }

}
