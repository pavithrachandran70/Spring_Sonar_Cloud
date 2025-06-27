package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeControllerTest {

    @Test
    void testHome() {
        HomeController controller = new HomeController();
        Model model = Mockito.mock(Model.class); // mock the Model
        String viewName = controller.home(model);
        assertEquals("home", viewName);
    }
}
