import java.util.Scanner;
public interface FortuneService {
	public void tellFortune(String name);

    Scanner sc=new Scanner(System.in);
	default String getzodiac()
    {
        System.out.println("Enter zodiac:");
        String b=sc.nextLine();
        return b;
    }
    
    default int getnumber()
    {
        System.out.println("Enter number:");
        int a=sc.nextInt();
        return a;
    }
    
}