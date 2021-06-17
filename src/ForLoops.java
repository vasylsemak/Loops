
public class ForLoops {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
		}
		
		byte[] bytesArr = {2, 7, 4, 9, 6, 11, 8, 13, 10, 15};
		
		for(int i = 0; i < bytesArr.length; i++) {
			byte curElm = bytesArr[i];
//			System.out.println(i + " element of bytesArr is ");
		}
		
		String[] cities = {"Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia", "Seattle"};
		
// ---       first way    -------
		int lastIdx = cities.length - 1;
		int j = 0;
		
//		for(int i = lastIdx; i > lastIdx / 2; i--) {
//			String lastCity = cities[i];
//			String firstCity = cities[j];
//			
//			cities[j] = lastCity;
//			cities[i] = firstCity;
//			
//			System.out.println("first city: " + cities[j] + ", " + "last city: " + cities[i]);
//			j++;
//		}
		
// ---       second way    -------
		for(int i = 0; i < cities.length / 2; i++) {
			String city = cities[i];
			cities[i] = cities[cities.length - 1 - i];
			cities[cities.length - 1 - i] = city;
		}
		for(int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
// ---       third way    -------		
//		while(j < lastIdx) {
//			String lastCity = cities[lastIdx];
//			String firstCity = cities[j];
//			
//			cities[j] = lastCity;
//			cities[lastIdx] = firstCity;
//			
//			System.out.println("first city: " + cities[j] + ", " + "last city: " + cities[lastIdx]);
//			j++;
//			lastIdx--;
//		}
		
	}
}
