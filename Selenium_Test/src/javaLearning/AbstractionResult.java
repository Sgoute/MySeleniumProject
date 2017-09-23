package javaLearning;

public  class AbstractionResult extends AbstractionEmployee
{
	

	public AbstractionResult(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionResult emp = new AbstractionResult("Sabitha", 10011);
		emp.employeeName();
		emp.employeeId();
		emp.getName();
		emp.getId();

	}

}
