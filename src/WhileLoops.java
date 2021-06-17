
public class WhileLoops {

	public static void main(String[] args) {
		boolean on = true;
		
		while(on) {
			System.out.println("Inside the while loop");
			on = !on;
		}
		
		int num = 1;
		
		while(num <= 10) {
			System.out.println(num);
			num++;
		}
		
		int count = 100;
		
		while(count >= -100) {
			System.out.println("equal nums: " + count);
			count -= 2;
		}
	}
	
}
