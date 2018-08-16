package DynamicProgramming;

public class MagicIndex2 {
	
	public int magicindex(int[] arr) {
		return magicindex(arr, 0, arr.length-1);
	}
	
	public int magicindex(int[] arr, int start, int end) {
		int mid = (start+end)/2;
		if(arr[mid] == mid) {
			return mid;
		}
		int midvalue = arr[mid];
		int leftIndex = Math.min(mid-1,midvalue);
		int left = magicindex(arr, 0, leftIndex);
		if(left>=0) {
			return left;
		}
		int rightIndex = Math.max(midvalue,  mid+1);
		int right = magicindex(arr, rightIndex, arr.length-1);
		return right;
		
	}

}
