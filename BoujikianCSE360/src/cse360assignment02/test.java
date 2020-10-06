package cse360assignment02;

public class test
{
	public static void main(String[] args) 
	{
		AddingMachine what = new AddingMachine();
		
		int value = 9;
		int shit = 69;
		
		what.subtract(value);
		what.add(shit);
		what.getTotal();
		System.out.println(what.toString() + "/" + what.getTotal());
		what.clear();
		System.out.print(what.toString() + "/" + what.getTotal());
	}
	
}
