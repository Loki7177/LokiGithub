package org.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.userlab.BaseClass;

public class Suite extends BaseClass {
	
	long starttime;

	@BeforeSuite
	public void start() {
		starttime = System.currentTimeMillis();
		launchBrowser();
	    browserMaxi();

	}

	@Test
	public void opengoogle() {
		launchUrl("https://www.google.com/");
	
	}

	@Test
	public void bing() {
		
		launchUrl("https://www.bing.com/");
	
			}

	@Test
	public void yahoo() {
		
		launchUrl("https://www.yahoo.com/");
	
	}

	@AfterSuite

	public void closebrowser() {
		long endtime = System.currentTimeMillis();

		long ttime = endtime-starttime;

		System.out.println("Total Time ="+ttime);




	}


	}
