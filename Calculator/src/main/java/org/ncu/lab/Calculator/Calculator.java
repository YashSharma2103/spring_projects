package org.ncu.lab.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Calculator {
	MathService add;
	MathService sub;
	MathService mul;
	MathService div;
	@Autowired
	@Qualifier("add")
	public void setAdd(MathService add)
	{
		this.add=add;
	}
	@Qualifier("sub")
	public void setSub(MathService sub)
	{
		this.sub=sub;
	}
	@Qualifier("add")
	public void setMul(MathService mul)
	{
		this.mul=mul;
	}
	@Qualifier("add")
	public void setDiv(MathService div)
	{
		this.div=div;
	}
	

	public void compute(String opr, int x, int y) {
		if(opr.equals("add")) {
			this.add.operate(x, y);
		}
		else if(opr.equals("sub")) {
			this.sub.operate(x, y);
		}
		else if(opr.equals("mul")) {
			this.mul.operate(x, y);
		}
		else if(opr.equals("div")) {
			this.div.operate(x, y);
		}
		else 
		{
			throw new RuntimeException();
		}
	}
}
