/**
 * 
 */
package javaLearning;

/**
 * @author KRISHNA
 *
 */
public class StaticPolyDemo_overloading
{
	public   int add( int a, int b)
	{
		return a+b;
	}

	public   int add( int a, Double b,int c, int d)
	{
		return  	(int) (a+b+c+d+a);
	}
	public   int add( int a,  int f,Float b )
	{
		return (int) (a+b+f);
	}
	public   int add( int a, int b, float g)
	{
		return (int) (a+b+g);
	}
}
