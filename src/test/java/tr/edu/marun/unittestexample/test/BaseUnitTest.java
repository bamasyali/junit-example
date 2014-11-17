/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.unittestexample.test;

import tr.edu.marun.unittestexample.service.UserService;
import tr.edu.marun.unittestexample.service.impl.UserServiceImpl;
import tr.edu.marun.unittestexample.test.dao.UserDaoMock;

/**
 *
 * @author bamasyali
 */
public abstract class BaseUnitTest {

    protected final UserService userService;

    public BaseUnitTest() {
        this.userService = new UserServiceImpl(new UserDaoMock());
    }

}
