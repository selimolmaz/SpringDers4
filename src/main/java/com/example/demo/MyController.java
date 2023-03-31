package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
//	private MyComponent myComponent;
//	private Example2 example2;
//
//	// Contructor injection
//	public MyController(Example2 example2) {
//		this.example2 = example2;
//	}

	private MyConfiguration myConfiguration;

	public MyController(MyConfiguration myConfiguration) {

		this.myConfiguration = myConfiguration;
	}

}
