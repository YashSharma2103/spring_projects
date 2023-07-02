public class EnglishFortuneTeller implements FortuneService 
{
    String[] fortunes = 
    {
        "A dubious friend may be an enemy in camouflage.", 
        "Your success will astonish everyone.", 
        "You will soon be surrounded by good friends and laughter.", 
        "Many will travel to hear you speak.",
        "Now is a good time to buy stock.",
        "Physical activity will dramatically improve your outlook today.",
        "Say hello to others. You will have a happier day.",
        "You should be able to undertake and complete anything.",
        "You will be pleasantly surprised today.",
        "You will be traveling and coming into a fortune."
    };
    @Override
    public void tellFortune(String name) 
    {

      String z = getzodiac();
		  int x = getnumber();
		  int y = z.length();
		
		  int res = (x+y)%fortunes.length;
		
		  System.out.println(name+", your fortune is: "+fortunes[res]);
        
    }
}
