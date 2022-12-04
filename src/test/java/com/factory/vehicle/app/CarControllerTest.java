package com.factory.vehicle.app;

import com.factory.vehicle.models.CarType;
import com.factory.vehicle.models.ProductionResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {

        ProductionResponse expected = restTemplate.getForObject("http://localhost:" + port +"/api/restful/v1/car/production?type=CABRIO", ProductionResponse.class);
        assertThat(expected.getType().equals(CarType.CABRIO) && expected.isProduced() == true).isTrue();
    }

}
