public class FactoryFortuneTeller {
	public FortuneService fortuneService(String lang) {
		if(lang.equals("eng")) 
        {
			return new EnglishFortuneTeller();
		}
        else if(lang.equals("fre")) 
        {
			return new FrenchFortuneTeller();
		}
        else if(lang.equals("spa")) 
        {
			return new SpanishFortuneTeller();
		}
        else 
        {
			throw new RuntimeException("Sorry, "+lang+" is not available!");
		}
	}
}