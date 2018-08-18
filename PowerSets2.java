package DynamicProgramming;

import java.util.ArrayList;

public class PowerSets2 {
	public ArrayList<ArrayList<Integer>> powerset(int[] nums){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		return getsubsets(list, new ArrayList<>(), nums, 0);
	}
	
	public ArrayList<ArrayList<Integer>> getsubsets(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, int[] nums, int start){
		list.add(new ArrayList<>(temp));
		for(int i = 0; i < nums.length; i++) {
			if(i>start && nums[i]==nums[i-1]) {continue; }
			temp.add(nums[i]);
			getsubsets(list, temp, nums, i+1);
			temp.remove(temp.size()-1);
		}
		return list;
	}

}
