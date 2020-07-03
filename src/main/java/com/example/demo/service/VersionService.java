package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class VersionService {

	public final String VERSAO = "1.0";
	
	public String getVersion() {
		return VERSAO;
	}
	
}
