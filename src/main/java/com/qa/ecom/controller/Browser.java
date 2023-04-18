package com.qa.ecom.controller;

import com.qa.ecom.service.Browsers;

public class Browser implements Browsers {

	public void refresh() {
		System.out.println("refresh");
		
		
	}

	public void forward() {
		System.out.println("forward");

		
	}

	public void backward() {
		
		System.out.println("backward");
	}

	public void get() {
		System.out.println("get");
	}

	public void navigateTo() {
		
		
	}

}
