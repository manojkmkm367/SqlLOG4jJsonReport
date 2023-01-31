package org.json;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReaderTrining {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("DetailesAboutManoj.json");
		Object parse = jsonParser.parse( ( fileReader ) );
		JSONObject obj= (JSONObject) parse;
		String name = (String) obj.get("Name"); System.out.println(name);
		  String age = (String)obj.get("Age"); 
		  int ageInt = Integer.parseInt(age) ;
		System.out.println( ageInt);
		String loc = (String) obj.get("Location"); System.out.println(loc);
		
		JSONArray bikeArray= (JSONArray ) obj.get("Bikes");
		
		Iterator iterator = bikeArray.iterator();
		int i=0;
		while(iterator.hasNext()) {
			System.out.println(i+" : "+iterator.next());i++;
		}
	}

}
