package DynamicProgramming;

import java.util.Arrays;

public class TripleStep {
	
	public int triplestep(int n) {
		int[] memo = new int[n+1];
		Arrays.fill(memo, -1);
		return solution(n,memo);
		
	}
	
	public int solution(int n, int[] memo) {
		
		if(n < 0) {
			return 0;
		}
		
		else if(n == 0) {
			return 1;
		}
		else if(memo[n] > -1) {
			return memo[n];
		}
		else {
			return solution(n-1, memo)+solution(n-2,memo)+solution(n-3,memo);
		}
		
		
	}

	
}
