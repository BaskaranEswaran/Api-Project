package com.day1JsonArray;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SimpleJson {
	public static void main(String []args) throws Throwable {
		FileReader fileread=new FileReader("C:\\Users\\VOSTRO\\eclipse-workspace\\BasssAPI\\src\\test\\resources\\simpleData.json");
		JSONParser jsonparser=new JSONParser();
		Object object = jsonparser.parse(fileread);
		
		JSONObject jsonObject=(JSONObject)object;
		Object jsonObj = jsonObject.get("firstName");
		System.out.println(jsonObj);
		System.out.println(jsonObject.get("lastName"));
		Object address = jsonObject.get("address");
		System.out.println(address);
		
		JSONObject objAddress=(JSONObject)address;
		Object taluk = objAddress.get("taluk");
		System.out.println(taluk);
		System.out.println(objAddress.get("street"));
		System.out.println(objAddress.get("district"));
	}

}
