package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHystrixController {
	
	@Value("${MY_ENV}")
	private String my_env_property;
	
	
	@RequestMapping(path="/myenv")
	public String getMyEnvProperty(){
		return my_env_property;
	}
	
	

}
