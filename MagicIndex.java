package DynamicProgramming;

public class MagicIndex {

	
	public int magicindex(int[] arr) {
		return magicIndex(arr, 0, arr.length-1);
	}
	
	public int magicIndex(int[] arr, int start, int end) {
		int index = 0;
		int mid = (start + end)/2;
		if(end<start) {
			return -1;
		}
		if(arr[mid] == mid) {
			index = mid;
			return index;
		}
		else if(arr[mid] < mid) {
			index = magicIndex(arr, 0, mid-1);
			
		} else {
			index = magicIndex(arr, mid, arr.length-1);
		}
		return index;
	}
}
