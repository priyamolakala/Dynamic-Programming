package DynamicProgramming;

public class RecursiveMult {
	
	public int recursethru(int a, int b) {
		int smaller = a < b ? a : b;
		int bigger = a < b ? b : a;
		return multirecurse( smaller,  bigger);
	}
	public int multirecurse(int smaller, int bigger) {
		if(smaller == 0) {
			return 0;
		}
		if(smaller == 1) {
			return bigger;
		}
		
		int s = smaller >> 1;
		int halfrecord = multirecurse(s,bigger);
		
		
		if(smaller % 2 == 0) {
			return halfrecord + halfrecord;
		} else {
			return halfrecord + halfrecord + bigger;
		}
	}
}
