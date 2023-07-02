public class SpanishFortuneTeller implements FortuneService 
{
    String[] fortunes = 
    {
      "Un amigo dudoso puede ser un enemigo camuflado",
      "Tu éxito sorprenderá a todos.",
      "Pronto estarás rodeado de buenos amigos y risas",
      "Muchos viajarán para escucharte hablar",
      "Ahora es un buen momento para comprar acciones.",
      "La actividad física mejorará drásticamente tu perspectiva hoy",
      "Saluda a los demás. Tendrás un día más feliz.",
      "Deberías ser capaz de emprender y completar cualquier cosa.",
      "Te sorprenderás gratamente hoy.",
      "Vas a viajar y ganarás una fortuna"
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
    

