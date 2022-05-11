package org.ncu.spring_labproject1;

import java.util.Random;

public class RandomeFortuneService implements FortuneService {
//	String array[]= {"happy","sad","excited"};
	@Override
	
	public String getRandomFortune(String[] array) {
		// TODO Auto-generated method stub
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}

	@Override
	public String getFortune(String[] array) {
		// TODO Auto-generated method stub
		return null;
	}

}
