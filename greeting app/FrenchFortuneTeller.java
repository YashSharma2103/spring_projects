public class FrenchFortuneTeller implements FortuneService 
{
    String[] fortunes = 
    {
      "Un ami douteux peut être un ennemi camouflé.",
      "Votre succès étonnera tout le monde.",
      "Vous serez bientôt entouré de bons amis et de rires.",
      "Beaucoup voyageront pour vous entendre parler.",
      "C'est le bon moment pour acheter des actions.",
      "L'activité physique améliorera considérablement vos perspectives aujourd'hui.",
      "Dites bonjour aux autres. Vous passerez une journée plus heureuse.",
      "Vous devriez être capable d'entreprendre et de terminer n'importe quoi.",
      "Vous serez agréablement surpris aujourd'hui.",
      "Vous voyagerez et ferez fortune."
    };
    @Override
    public void tellFortune(String name) {
		int x = getnumber();
		String z = getzodiac();
		int y = z.length();
		
		int res = (x+y)%fortunes.length;
		
		System.out.println(name+", your fortune is: "+fortunes[res]);
        
    }
}
    

