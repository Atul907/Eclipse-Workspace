package methodCategorization;

public class FarmerAssignment {

	//int area = length * width;
	
	public int farmLand (int length, int width) {
		int area = length * width;
		return area;
	}
	
	public static void main(String[] args) {
		
		FarmerAssignment fl = new FarmerAssignment ();
		
		int area1 = fl.farmLand(25, 40);
		System.out.println("area of land 1 is : " + area1);
		int area2 = fl.farmLand(40, 50);
		System.out.println("area of land 2 is : " + area2);
		int area3 = fl.farmLand(60, 70);
		System.out.println("area of land 3 is : " + area3);
		int area4 = fl.farmLand(70, 65);
		System.out.println("area of land 4 is : " + area4);
		
		int totalArea = area1+area2+area3+area4;
		System.out.println("total area of farmers all lands is :" + totalArea );
		
	}
	
}