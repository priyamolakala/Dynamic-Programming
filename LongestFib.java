package DynamicProgramming;
import java.util.*;

public class LongestFib {
	public int lenLongestFibSubseq(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<A.length; ++i)
            map.put(A[i],i);
        int maxLen = 0, idx = 0;
        for(int i=0; i<A.length; ++i){
            for(int j=i+1; j<A.length; ++j){
                int left = i, right = j, count = 0;
                while(map.containsKey(A[left] + A[right])){
                    int temp = right;
                    right = map.get(A[left] + A[right]);
                    left = temp;
                    count ++;
                }
                if(count != 0){
                    count += 2;
                    maxLen = Math.max(maxLen,count);
                }
            }
        }
        return maxLen;
    }
}
