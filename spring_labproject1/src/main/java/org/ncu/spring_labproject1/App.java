package org.ncu.spring_labproject1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String array[]= {"prosperity","wealthiness","affluence","karma","serendipity","capital","opulence"};
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GreetingService gs = context.getBean("englishGreetingService", GreetingService.class);
		gs.greet("Catherine");
		
		System.out.println("So Currently your fortune is representing: " + gs.getDailyFortune(array));
		context.close();
	}
}
