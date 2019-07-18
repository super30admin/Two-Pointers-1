//Approach: In the question  it is given that input contains only 0,1 and 2 therefore we will check in input 
//Iterate through whole array and check if 0 then put at the start of array and start++ and if 2 then put at the end of array, end-- and reduce index by 1. 
//values at start pointer will put where  0  element is found and value at end pointer will put  where 2 is found.

//Time complexity of this function: O(n)  n is length of array
//Space Complexity of this function: O(1)  

//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this:yes
public class SortColors {
	
	public static void sortNumbers(int[] array) {
		int start =0; int end = array.length-1; 
		int index=0;
		while(index<=end) {
			if(array[index] ==0) {
				array[index] = array[start];
				array[start] = 0;
			    start++;	
			}
			if(array[index]==2) {
				array[index] = array[end];
				array[end]=2;
				end--;	
				index--;
			}
			index++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,1,0};
		for(int i=0;i<nums.length;i++) {
			System.out.println("input array is="+nums[i]);
		}
		sortNumbers(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println("sorted output array is="+nums[i]);
		}

	}

}
