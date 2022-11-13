package loopConcept;

public class WhileLoopReverse {

	public static void main(String[] args) {
		
		int x = 17031997 ;
		int y;
		int z = 0;
		
		while (x>0) 
		{
			y = x % 10;			// 1 , 1, 2, 5
			z = z*10+y;			// 1, 11, 112, 1125
			x = x/10;			// 521, 52, 5, 0
		}
		System.out.println(z);
	}

}
