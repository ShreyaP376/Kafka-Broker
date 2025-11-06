package com.example.demo.service;

public class ExcelServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		System.out.println("Processing data for excel");
	}

	@Override
	public String printData() {
		System.out.println("Printing excel");
		return "excel";
	}

}
