// TC: O(N) since we are checking each element in the array and N represents the number of elements in array
// SC: O(1) since we are not using any extra space

// Keep 2 pointers, start and end, if the element is 0, replace it with element from the start and place the 0 at start index and increment st++.
// if element is 2, replace the element from end to that index and place 2 at end of array, decrement end pointer.
// if element is 1, just increment the index since it will be adjusted by replacing element 0 at start and 2 at end.

public class SortColor {
	
	public void sortColor(int[] nums) {
		
		int st = 0;
		int end = nums.length-1;
		int i =0;
		
		while(i<=end) {
		
			if(nums[i]==0) {
				nums[i] = nums[st];
				nums[st] = 0;
				st++;
				i++;
			}else if(nums[i]==2) {
				nums[i] = nums[end];
				nums[end] = 2;
				end--;
			}else {
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		SortColor sc = new SortColor();
		
		int[] nums = { 2, 1, 0, 0, 1, 2};
		sc.sortColor(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
	}

}
