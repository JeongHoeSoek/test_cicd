package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();
        String response = controller.hello();
        assertThat(response).isEqualTo("Hello, World!");
    }
}
