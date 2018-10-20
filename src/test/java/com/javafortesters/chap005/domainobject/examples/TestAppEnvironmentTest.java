package com.javafortesters.chap005.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void GetUrlStatically(){
        assertEquals("Returns url", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("just the domain", "192.123.0.3", TestAppEnv.DOMAIN);

        assertEquals("just the port", "67", TestAppEnv.PORT);
    }
}
