package com.example.controller;

import org.junit.Test;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class HomeControllerTest {

    @Test
    public void testHomeReturnsHomeView() {
        HomeController controller = new HomeController();
        String viewName = controller.home(null);
        assertEquals("home", viewName);
    }

    @Test
    public void testHomeSetsWelcomeMessage() {
        HomeController controller = new HomeController();
        Model mockModel = mock(Model.class);

        String viewName = controller.home(mockModel);

        verify(mockModel).addAttribute("welcomeMessage", "Welcome to the home page!");
        assertEquals("home", viewName);
    }
}
