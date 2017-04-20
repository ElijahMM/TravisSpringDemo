package com.example;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.awt.image.RescaleOp;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    UserController userController;

    @Test
    public void testSimpleString() {
        String a = "abcde";
        String b = new String(a);
        assertTrue(a.equals(b));
        assertFalse(a == b);
        assertEquals(a, b);
    }

}
