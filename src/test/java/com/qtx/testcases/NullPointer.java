package com.qtx.testcases;

import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class NullPointer {
	
	@Test
	public void exceptionTest() {

			Map<String,String> planes = new TreeMap<String,String>();
			planes.put("N753HF", "piper");
			planes.put("N951ER", "cesna");
			planes.put("N951ER", "grumman");
			planes.put("N147PT", "beech");
			
			for(Map.Entry<String, String> plane : planes.entrySet()) {
				System.out.println(plane.getValue());
			}
		
	}

}
