package DynamicProgramming;
import java.util.*;

public class BooleanEvaluation {
	
	public boolean tobool(String c){
		return c.equals("1") ? true : false;
	}
	
	public int countEval(String s,boolean result,HashMap<String, Integer> memo) {
		if(s.length() == 0) {
			return 0;
		}
		if(s.length() == 1) {
			return tobool(s) == result?1:0;
		}
		
		if(memo.containsKey(result+s)) {
			return memo.get(result+s);
		}
		int ways = 0;
		int total = 0;
		for(int i = 1; i < s.length(); i+=2) {
			char c = s.charAt(i);
			String left = s.substring(0, i);
			String right = s.substring(i+1,s.length());
			int lefttrue = countEval(left,true,memo);
			int leftfalse = countEval(left,false,memo);
			int righttrue = countEval(right,true,memo);
			int rightfalse = countEval(right,false,memo);
		    total = (lefttrue + leftfalse) + (righttrue + rightfalse);
			
			int totalways = 0;
			if(c == '^') {
				 totalways = lefttrue * rightfalse + leftfalse * righttrue;
			}
			else if(c == '&') {
				totalways = lefttrue * righttrue ;
			}
			else if(c == '|') {
				totalways = leftfalse * righttrue + lefttrue * rightfalse + lefttrue * righttrue;
				}
			
			int subways =  result ? totalways : total - totalways;
			
			ways+=subways;
			
			memo.put(result+s,ways);
			return ways;
			
		}
	

}
}
