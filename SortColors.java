//Time complexity: O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Approach
//1) Initalize three pointers i,k to left and j to right
//2) here i represents 0's , j represents 2's and k represents 1's
//3) while k <=j, if value at k is 2 decrease j, if value equals 1 increase k and if value equals 0 increase i and k

public class SortColors {
	 public void sortColors(int[] nums) {
	        if(nums == null || nums.length == 0)return;
	        int i=0;
	        int k=0;
	        int j=nums.length -1;
	        while(k<=j){
	            if(nums[k] == 2){
	                swap(nums, k,j);
	                j--;
	            }else if(nums[k] == 1){
	                k++;
	            }else{
	                swap(nums, k,i);
	                i++;
	                k++;
	            }
	        }
	    }
	    public int[] swap(int[] nums, int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	        return nums;
	    }

	public static void main(String[] args) {
		SortColors obj = new SortColors();
		int nums[] = {2,0,2,1,1,0};
		obj.sortColors(nums);
		for(int num:nums) {
			System.out.print(num + " ");
		}
		
	}

}
