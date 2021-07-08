public class SortColor {

	// 3points :  
	// using two pass.  
	// 1. initially traverse through the whole array and count no of 0's , 1's and 2's
	// 2. print the numbers according the no of 0's , 1's and 2's in the ascending 0rder.
	// Time Complexity : O(n) = 1st pass n times + 2nd pass n times. == total n times.
	// Space Complexity : O(1) Constant.
	
	
	// using two pointer in One Pass.  
	// 1. Maintain two pointer , i.e. one for 0's and other for 1's
	// 2. if the current ith elment is 0, then swap the we swap a[i] and a[zeroIndex]  and increment zero index and i, 
	// if a[i] is 2, we swap a[i] and a[twoIndex] and decrement two index, if a[i] is one, we do nothing and continue to process next element.

	// Time Complexity : O(n) = only 1 while loop  == total n times.
	// Space Complexity : O(1) Constant.
	
	
	// Did this code successfully run on Leetcode : Yes
	// Any problem you faced while coding this : No


	// Your code here along with comments explaining your approach

	static class Solution {
	    public void sortColors(int[] nums) {
	        int zeros=0,ones=0,twos=0;
	    	for(int i=0;i<nums.length;i++){
	    		if(nums[i] == 0){
	    			zeros++;
	    		}else if(nums[i] == 1){
	    			ones++;
	    		}else{ // assuming the elements are only 0,1,2
	    			twos++;
	    		}
	    	}
	    	for(int i=0;i<nums.length;i++){
	    		if(zeros>0){
	    			nums[i] = 0;
	    			zeros--;
	    		}else if(ones >0){
	    			nums[i] = 1;
	    			ones--;
	    		}else{ // assuming the elements are only 0,1,2
	    			nums[i] = 2;
	    		}
	    		
	    	}
	    	//for printing 
	    	for(int i=0;i<nums.length;i++){
	    		System.out.print(nums[i]+" ");
	    	}
	    	
	    }
	}
	
	
	static class TwoPointerSolution {
	    public void sortColors(int[] nums) {
	      
	    	int zeroIndex = 0, twoIndex = nums.length - 1, i = 0;
	    	while( i <= twoIndex ) {
	    		if( nums[i] == 0 ) 
	    			swap(nums, zeroIndex++, i++);
	    		else if( nums[i] == 2)
	    			swap(nums, twoIndex--, i);    
	    		else
	    			i++;  // we encountered 1 , so dont do anything and increment i.
	    	}
	    	
	    	//for printing 
	    	System.out.println("\n ");
	    	for( i=0;i<nums.length;i++){
	    		System.out.print(nums[i]+" ");
	    	}
	    	
	    }

	    public void swap(int[] nums, int i, int j) {
	    	int temp = nums[i];
	    	nums[i] = nums[j];
	    	nums[j] = temp;
	    }
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {2,0,2,1,1,0};
		s.sortColors(arr);
		
		TwoPointerSolution s2 = new TwoPointerSolution();
		int[] arr2 = {2,0,2,1,1,0};
		s2.sortColors(arr2);

	}

}
