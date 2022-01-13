package org.testng;

import org.testng.annotations.Test;

public class DependsonMethods {

	@Test(enabled=true)
	public void highschool() {
		System.out.println("High School");

	}
	@Test(dependsOnMethods="highschool")
	public void highsecschool() {
		System.out.println("Higher Secondary School");

	}
	@Test(dependsOnMethods="highsecschool")
	public void ug() {
		System.out.println("Under Graduate");

	}
	@Test(dependsOnMethods="ug")
	public void pg() {
		System.out.println("Post Graduate");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
