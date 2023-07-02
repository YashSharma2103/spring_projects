import java.util.Scanner;
public class MainApp 
{
    public static void main( String[] args )
    {
    	FactoryGreetingService factory = new FactoryGreetingService();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter language(spa,eng,fre):");
            String a=sc.nextLine();
            GreetingService service = factory.greeting(a);
            System.out.println("Enter name:");
            String b=sc.nextLine();
            service.greet(b);

            FactoryFortuneTeller factory2 = new FactoryFortuneTeller();
            FortuneService service2 = factory2.fortuneService(a);
            service2.tellFortune(b);
        }
    }
}