package com.example.demo.service;

public class PdfServiceImpl extends DocumentServiceAB {

	@Override
	public void processData() {
		System.out.println("Processing data for pdf");	
	}

	@Override
	public String printData() {
		System.out.println("Printing data into pdf");
		return "pdf";
	}

}
