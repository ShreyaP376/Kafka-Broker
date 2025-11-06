package com.example.demo.factory;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelServiceImpl;
import com.example.demo.service.PdfServiceImpl;

public class Factory {

	public static DocumentService createObj(String type) {
		if(type.equals("pdf")) {
			return new PdfServiceImpl();
		}
		if(type.equals("excel")) {
			return new ExcelServiceImpl();
		}
		return null;
	}
}
