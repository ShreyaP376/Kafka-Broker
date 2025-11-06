package com.example.demo.service;

public abstract class DocumentServiceAB implements DocumentService{

	@Override
	public void readDatafromDB() {
		// TODO Auto-generated method stub
		System.out.println("Reading data from DB");
		
	}
	
	@Override
	public String printInvoice() {
		readDatafromDB();
		processData();
		return printData();
	}

}
