package org.ncu.spring_labproject1;


public class EnglishGreetingService implements GreetingService{

	
	private FortuneService fortuneService;
//	String arr[]= {"happy","sad","excited"};
	
	public EnglishGreetingService(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("A warm welcome to "+name);
	}
	@Override
	public String getDailyFortune(String arr[]) {
		 return fortuneService.getFortune(arr);
	}
	
	
}