package com.isaccanedo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@RequestMapping("/hellouser")
	public String getUser()
	{
		return "Hello Usuário!";
	}
	
	@RequestMapping("/helloadmin")
	public String getAdmin()
	{
		return "Hello Administrador!";
	}

}
