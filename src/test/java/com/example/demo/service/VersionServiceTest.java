package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoSettings;

@MockitoSettings
class VersionServiceTest {

	@InjectMocks
	private VersionService versionService;
	
	@Test
	void test() {
		String version = versionService.getVersion();
		
		assertEquals("1.0", version);
	}

}
