package org.testng;

import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority=3)
	public void firstgear() {
	System.out.println("firstgear");
		
	}
	
	@Test(priority=2,enabled=false)
	public void startmusic() {
	System.out.println("startmusic");
		
	}
	
	
	@Test(priority=4)
	public void Secondgear() {
		System.out.println("Secondgear");
			
		}
	@Test(priority=1)
	public void Startcar() {
		System.out.println("Startcar");
			
		}
	@Test(priority=5)
	public void thirdgear() {
		System.out.println("thirdgear");
			
		}
	
	@Test(priority=6)
	public void fourtgear() {
		System.out.println("fourtgear");
			
		}
	
	@Test(priority=7)
	public void fifthgear() {
		System.out.println("fifthgear");
			
		}
}
