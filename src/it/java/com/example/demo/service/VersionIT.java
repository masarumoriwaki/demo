package com.example.demo.service;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class VersionIT {

	@Autowired
    private MockMvc mockMvc;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
//	private MockRestServiceServer mockServer;
	
	@BeforeEach
	public void setUp() {
//		mockServer = MockRestServiceServer.bindTo(restTemplate).bufferContent().build();
	}
	
	@Test
	public void testaServico() throws Exception {
		 this.mockMvc.perform(get("/version")
		            .contentType("application/json"))
		            .andExpect(status().isOk())
		            .andDo(print());
	}
}
