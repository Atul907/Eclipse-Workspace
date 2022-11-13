package arrayProgram;

public class FrequencyOfArray {

	public static void main(String[] args) {

		int [] a = {4 , 7,5 ,17, 7 , 8 ,9 ,17, 7, 17};
		
		int num = 17;
		int num1 = 7;
		
		int count = 0 ;
		int count1 = 0;
		
		for (int i =0; i<a.length; i++)
		{
			if (a[i] == num)
			{
				count++;
			}
			
			if (a[i] == num1)
			{
				count1++;
			}
			
		}
		System.out.println("frequency of " + num + " in array is " + count);
		System.out.println("frequency of " + num1 + " in array is " + count1);
	}

}
