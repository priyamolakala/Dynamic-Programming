package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationUnique {
	public ArrayList<ArrayList<Integer>> permutatn(int[] nums){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(nums);
		return getpermsets(list, new ArrayList<>(), nums, new boolean[nums.length+1]);
	}
	
	public ArrayList<ArrayList<Integer>> getpermsets(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, int[] nums, boolean[] used){
		if(temp.size() == nums.length) {
			list.add(new ArrayList<>(temp));
		}
		else {
		for(int i = 0; i < nums.length; i++) {
			if(used[i] || i>0 && nums[i] == nums[i-1] && !used[i-1]) { continue;}
			used[i] = true;
			temp.add(nums[i]);
			getpermsets(list, temp, nums, used);
			used[i] = false;
			temp.remove(temp.size()-1);
		}
		
	} 
		return list;
	}


}
