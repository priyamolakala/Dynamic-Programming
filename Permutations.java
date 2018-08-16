package DynamicProgramming;

import java.util.ArrayList;

public class Permutations {
	
	public ArrayList<ArrayList<Integer>> permutatn(int[] nums){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		return getpermsets(list, new ArrayList<>(), nums);
	}
	
	public ArrayList<ArrayList<Integer>> getpermsets(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, int[] nums){
		if(temp.size() == nums.length) {
			list.add(new ArrayList<>(temp));
		}
		else {
		for(int i = 0; i < nums.length; i++) {
			if(temp.contains(nums[i])) { continue;}
			temp.add(nums[i]);
			getpermsets(list, temp, nums);
			temp.remove(temp.size()-1);
		}
		
	} 
		return list;
	}

}
