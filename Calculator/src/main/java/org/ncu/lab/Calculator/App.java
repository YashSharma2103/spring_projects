package org.ncu.lab.Calculator;
import java.util.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;

public class App 
{
    public static void main( String[] args ) {
    	//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Calculatorconfig.class);
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter Operation to perform (add/sub/mul/div): ");
    	String opr = sc.next();
    	
    	System.out.print("Enter 1st operand: ");
    	int x = sc.nextInt();
    	System.out.print("Enter 2nd operand: ");
    	int y = sc.nextInt();
    	
    	Calculator cal = context.getBean(Calculator.class);
    	cal.compute(opr, x, y);
    	
    	sc.close();
    	context.close();
    }
}
