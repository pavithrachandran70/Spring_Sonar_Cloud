//package com.example;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.ui.Model;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class HomeControllerTest {
//
//    @Test
//    void testHome() {
//        HomeController controller = new HomeController();
//        Model model = Mockito.mock(Model.class); // mock the Model
//        String viewName = controller.home(model);
//        assertEquals("home", viewName);
//    }
//}

package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

class HomeControllerTest {

    @Test
    void testHome() {
        // Arrange
        HomeController controller = new HomeController();
        Model model = Mockito.mock(Model.class);

        // Act
        String viewName = controller.home(model);

        // Assert
        assertEquals("home", viewName);
        verify(model).addAttribute("message", "Welcome to Spring MVC with SLF4J Logging!");
    }
}
