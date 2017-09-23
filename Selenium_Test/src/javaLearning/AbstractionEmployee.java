/**
 * 
 */
package javaLearning;

/**
 * @author KRISHNA
 *
 */
public abstract class AbstractionEmployee 
{
	private String name;
	private int id;
	
	public   AbstractionEmployee(String name, int id)
	{
		this.name=name;
		this.id= id;
	}

	public   void employeeName()
	{
		//System.out.println("Emoployee name is "+this.name);
	}
	public void employeeId()
	{
		//System.out.println("Emoployee name is "+this.id);
	}
	
	public String getName()
	{
		//System.out.println("Emoployee name is "+name);
		return name;
		
	}
	public int getId()
	{
	//	System.out.println("Emoployee name is "+id);
		return id;
		
	}
	
	public void setName(String name, int id)
	{
		
		this.name=name;
		this.id=id;
	}
}
