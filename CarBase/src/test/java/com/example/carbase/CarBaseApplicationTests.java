package com.example.carbase;

import com.example.carbase.web.CarController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CarBaseApplicationTests {
    @Autowired
    private CarController carController;

    @Test
    @DisplayName("First example test case")
    void contextLoads() {
        assertThat(carController).isNotNull();
    }
}
