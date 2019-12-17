package countingduplicates;

import java.util.HashMap;

public class CountingDuplicates {

	public static int duplicateCount(String text) {
		text = text.toUpperCase();
		
		HashMap<Character,Integer> uniqueChars = new HashMap<Character,Integer>();
		int appearances;
		
		for(char e: text.toCharArray()) {
			if(uniqueChars.containsKey(e)) {
				appearances = uniqueChars.get(e);
			}else {
				appearances = 0;
			}
			appearances++;
			
			uniqueChars.put(e, appearances);
		}

		int result = 0;
		for(Integer numAppearances: uniqueChars.values()) {
			if(numAppearances>1) {
				result++;
			}
		}
		
		return result;
	}
}