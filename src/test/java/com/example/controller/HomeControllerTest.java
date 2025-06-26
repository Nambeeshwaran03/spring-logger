package com.example.controller;

import org.junit.Test;
import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void testHomeReturnsHomeView() {
        HomeController controller = new HomeController();
        String viewName = controller.home();
        assertEquals("home", viewName);
    }
}
