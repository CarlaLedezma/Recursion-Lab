package Lab4_RecursionLab;

public class ArraySum {

	public static int sumOfArray(Integer[] a, int index) {

		int sumResult;

		if(index<0)		//Base code. Meaning it will stop when follow the condition
			sumResult= 0;
		else {
			//int = int+ int
			//Notice when index<0, the result will be =0
			sumResult=a[index]+ sumOfArray(a,(index-1));
			System.out.println("sumResult is a["+index+"] + sumOfArray(a,("+ (index -1)+"))");
		}
		return sumResult;
	}

}
