		package org.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {

	public static void main(String[] args) throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Manojkumar");
		jsonObject.put("Age", "25");
		jsonObject.put("Location", "CBE");
		
		JSONArray array = new JSONArray();
		array.add("Duke");
		array.add("FZ");
		array.add("Jupiter");
		
		jsonObject.put("Bikes", array);
		
		FileWriter fileWriter = new FileWriter("DetailesAboutManoj.json");
		
		fileWriter.write(jsonObject.toString());
		
		fileWriter.close();
		
		System.out.println("done");

	}

}
