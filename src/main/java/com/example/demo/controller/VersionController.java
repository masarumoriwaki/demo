package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.VersionService;

@RestController
public class VersionController {

	@Autowired
	private VersionService versionService;
	
	@GetMapping("version")
	public ResponseEntity<String> getVersion(){
		return new ResponseEntity<>(versionService.getVersion(), HttpStatus.OK);
	}
	
}
