package Java;

public class SolveLinearEquations {
	
	public static void solveEquations(double a,double b,double c,double m ,double n,double o) {
		
		double determinant = a * n - b * m;
		
		if (determinant ==0 ) {
			
			System.out.println ("The System of equations has no unique solution (determinant = 0).");
			
			return;
		}
		
		double determinantX = c * n - b * o;
		double determinantY = a * o - c * m;
		
		double x = determinantX / determinant;
		double y = determinantY / determinant;
		
		System.out.println ("Solution:");
		System.out.println ("x = " + x);
		System.out.println ("y = " + y);
		
	}
	
	public static void main (String [] args) {
		
		double a = 2, b = 3, c = 8;
		double m = 1, n =4, o = 10;
		
		solveEquations(a,b,c,m,n,o);
	}

}
