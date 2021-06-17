
public class DoWhileLoops {

	public static void main(String[] args) {
		boolean on = false;
		
		do {
			System.out.println("Inside the do-while loop");
		} while(on);
		
		// 1 through 49
		int count = 1;
		
		do {
			System.out.println("odd nums: " + count);
			count += 2;
		} while (count <= 49);
		
		// print single letter
		char firstLetter = 'a';
		char lastLetter = 'z';
		
		do {
			System.out.println("letter: " + firstLetter);
			firstLetter++;
		} while(firstLetter <= lastLetter);
		
		char c = 'a';
		System.out.println("Next alphabet char using ++: " + (++c));


	}

}
