package javaLearning;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class DynamicPoly_OverRidden extends PolyDemo_OverRidden
{
	public void Bike()
	{
		System.out.println("I need a Car");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PolyDemo_OverRidden vehicle = new DynamicPoly_OverRidden();
		vehicle.Bike();
		
		
	}

}
