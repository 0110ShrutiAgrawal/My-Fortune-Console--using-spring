package org.ncu.spring_labproject1;


public class EnglishFortuneService implements FortuneService {
	private RandomeFortuneService rf;
	public EnglishFortuneService(RandomeFortuneService rf)
	{
		this.rf=rf;
	}
//	 public String getFortune()
//	 {
//		 return "Today is your lucky day !";
//	 }

	@Override
	public String getFortune(String[] array) {
		// TODO Auto-generated method stub
		return rf.getRandomFortune(array);
	}

	@Override
	public String getRandomFortune(String[] array) {
		// TODO Auto-generated method stub
		return null;
	}
}
