package Test6;
public class Test6 {

	public static void main(String[] args) {
		double y=0;
		int x=1;
		while(y<=5000) {
			x++;
			y = Math.pow(x, 2);
			
		}
		System.out.println("Minimum value for x^2 > 5000 is "+x);
		

	}

}
