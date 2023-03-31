package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyComponent {
	//Lazy annotation'u eğer class'a ihtiyaç duyulursa oluşturulmasını sağlıyor
	//Diğer durumda bu component ioc'ye @Componenet annotation aldığı için otomatik olarak (bean olarak) oluşturulacak!
	public MyComponent() {
		System.out.println("MyComponenet Bean initialized!");
	}
}
