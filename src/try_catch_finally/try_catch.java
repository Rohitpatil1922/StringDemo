package try_catch_finally;

public class try_catch {
	
	public static void main(String[] args) {
		
		int x[] = {1,4,6,8,9,2};
		int y = 0, res;
		
		try {
			res = x[7] / y;
			
		}catch(ArithmeticException e) {
			System.out.println("Can't "+ e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally Block");
		}
	
	
	

     }
	
	
}