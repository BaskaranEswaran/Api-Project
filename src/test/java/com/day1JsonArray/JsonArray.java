package com.day1JsonArray;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonArray {
	public static void main(String[]args) throws Throwable {
		FileReader fileread=new FileReader("C:\\Users\\VOSTRO\\eclipse-workspace\\BasssAPI\\src\\test\\resources\\JSONArray.json");
		JSONParser jsonparser=new JSONParser();
		Object object = jsonparser.parse(fileread);
		
		JSONObject jsonObject=(JSONObject)object;
		Object page = jsonObject.get("page");
		System.out.println(page);
		System.out.println(jsonObject.get("per_page"));
		System.out.println(jsonObject.get("total"));
		System.out.println(jsonObject.get("total_pages"));
		
		Object data = jsonObject.get("data");
		System.out.println(data);
		
		JSONArray jsonArray=(JSONArray)data;
		
		for (int i = 0; i < jsonArray.size(); i++) {
			Object everyArrayList = jsonArray.get(i);
			
			JSONObject jsonObject1=(JSONObject)everyArrayList;
			Object id = jsonObject1.get("id");
			System.out.println(id);
			System.out.println(jsonObject1.get("email"));
			System.out.println(jsonObject1.get("first_name"));
			System.out.println(jsonObject1.get("last_name"));
			System.out.println(jsonObject1.get("avatar"));
		}
		
		Object support = jsonObject.get("support");
		JSONObject jsonObject2=(JSONObject)support;
		System.out.println(jsonObject2.get("url"));
		System.out.println(jsonObject2.get("text"));
		
	}

}
