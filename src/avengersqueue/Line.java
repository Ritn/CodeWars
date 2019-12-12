package avengersqueue;
public class Line {
	public static String Tickets(int[] peopleInLine){
		int billsOf25 = 0;
		int billsOf50 = 0;
		
		int pos = 0;
		boolean hasChange = true;
		while(hasChange && pos < peopleInLine.length) {
			switch(peopleInLine[pos]) {
				case 25:
					billsOf25++;
					break;
					
				case 50:
					billsOf25--;
					billsOf50++;
					break;
				
				case 100:
					if(billsOf50>0) {
						billsOf50--;
						billsOf25--;
					}else {
						billsOf25 -= 3;
					}
					break;
			}			
			
			if(billsOf25<0 || billsOf50<0) {
				hasChange = false;
			}
		
			pos++;
		}
		
		return hasChange ? "YES" : "NO";
	}
}