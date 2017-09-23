/**
 * 
 */
package javaLearning;

/**
 * @author KRISHNA
 *
 */
public class InheritanceResult extends Inheritancemathematics
{

	public void Subraction(int x, int y )
	{
		a=x-y;
		System.out.println("subraction of two numbers x and y is "+a );
	
	}
	public static void main (String args[])
	{
	
		InheritanceResult result = new InheritanceResult();
		result.addition(30, 40);
		result.multiplication(15, 6);
		result.Subraction(86, 54);
		
	}
	
}
