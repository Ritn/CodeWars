package phonenumber;

public class Kata {
	public static String createPhoneNumber(int[] numbers) {
		String numbersString = "";
		for(int number: numbers) {
			numbersString += Integer.toString(number);
		}
			
		return "("+numbersString.substring(0, 3)+") "+numbersString.substring(3,6)+"-"+numbersString.substring(6);
	}
}