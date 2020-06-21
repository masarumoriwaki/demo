package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class VersionService {

	public String getVersion() {
		return "1.0";
	}
	
}
