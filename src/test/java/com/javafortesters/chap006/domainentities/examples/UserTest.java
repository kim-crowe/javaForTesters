package com.javafortesters.chap006.domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void canConstructANewUser(){
        User user = new User();

        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameANdPassword(){
        User user = new User("admin", "pA55w0rD");

        assertEquals("given username expected", "admin", user.getUsername());
        assertEquals("given password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("Pazzwor6");

        assertEquals("setter password expected", "Pazzwor6", user.getPassword());
    }
}
