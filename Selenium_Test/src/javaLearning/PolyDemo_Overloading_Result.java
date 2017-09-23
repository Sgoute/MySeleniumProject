package javaLearning;

public class PolyDemo_Overloading_Result
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticPolyDemo_overloading demo = new StaticPolyDemo_overloading();
	
		demo.add(50, 50, 60);
		int result =demo.add(9, (double) 99, 88, 654);
		
		System.out.println("addtion is "+result);
		
	}

}
