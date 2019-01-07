package com.el.spring.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Blue {
	
	public Blue(){
		System.out.println("blue...constructor");
	}

	@PostConstruct
	public void init(){
		System.out.println("blue...init...");
	}
	@PreDestroy
	public void detory(){
		System.out.println("blue...detory...");
	}
	
	

}
