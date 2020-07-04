package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoSettings;

@MockitoSettings
class VersionServiceTest {
	
	public static final String VERSAO = "1.0";

	@InjectMocks
	private VersionService versionService;
	
	@Test
	void testarVersao() {
		String version = versionService.getVersion();
		
		assertEquals(VERSAO, version);
	}

}
