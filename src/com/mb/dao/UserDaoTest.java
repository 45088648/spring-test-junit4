/* @(#) UserDaoTest.java
 * 
 * Date: 2012-1-16
 *
 * Author: Rainisic
 */
package com.mb.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author Rainisic
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest extends AbstractJUnit4SpringContextTests {
    
//    @Resource
//    private UserDaoInterface userDao;
    
    @Test
    @Repeat(100)
    public void saveTest() {
        System.out.println("test------------------------");
    }
}