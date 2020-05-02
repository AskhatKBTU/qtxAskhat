package com.qtx.testcases;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class NewTestCheck {
	
	@Test
	public void exceptionTest() {
		String eleven = "Porsche 911";
		String twentyEight = "Porsche 928";
		String fourteen = "Porsche 914";
		Set<String> jerryCars = new HashSet<String>();
		jerryCars.add(eleven);
		
		Set<String> myCars = new HashSet<String>();
		myCars.addAll(jerryCars);
		myCars.add(twentyEight);
		myCars.add(fourteen);
		
		jerryCars.removeAll(myCars);
		System.out.println(jerryCars.size());
			
	}

}
