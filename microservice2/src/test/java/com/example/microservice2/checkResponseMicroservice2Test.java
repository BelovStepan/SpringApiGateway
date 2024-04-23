package com.example.microservice2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class checkResponseMicroservice2Test {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testEndpoint() throws Exception {
        mockMvc.perform(get("/test2"))
                .andExpect(status().isOk())
                .andExpect(content().string("The response from the second microservice has returned!"));
    }
}
