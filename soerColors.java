//75. Sort Colors
//Time Complexity :O(n) as iterating through all n elements
//Space Complexity : O(1) i.e. as no extra space is required to store array elements while processing 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*Step 1: If array is empty or null then return empty list. If not then sort the Array and run a loop for I pointer which will always be greater than 0. Assign "i+1"th 
 * element to left pointer and last element as right pointer. Now find the sum with ith element+ left element+right element. 
 * Step 2: After finding out the SUM, check the sum value with 0 as we have to find the 3 element's from array forming sum as 0. If sum is less then 0, 
 * means we want bigger number in order for sum to be equal to 0. As the array is sorted, we will increment the left pointer and then again calculate the sum. 
 * Step 3":If sum is greater than 0. Means we have to decrement the right pointer to make sum closer or equal to 0. 
 * Step 4: If sum is equal to 0, then increment left pointer and decrement right pointer simultaneously. Also, after incrementing and decrementing, 
 * if the same element comes means there are chances of calculating duplicate triplet to form sum. 
 * To avoid this we will skip similar elements while incrementing i and left pointer and decrementing right pointer.
 * Step 5:When we find sum as 0, we will add it into the list named Result. once left pointer crosses right pointer means we are done traversing through whole array,
 * and then we will come out of all loops and return the result.
 */

//output 001122
public class soerColors {
	    public static int[] sortColors(int[] nums) {
	    if(nums.length == 0 || nums == null) return new int[] {};
	        
	    int low=0;
	    int high=nums.length-1;
	    int mid=0;
	    
	        while(mid<=high){
	        if(nums[mid] == 0)
	        {
	            swap(nums, mid, low);
	            low++;
	            mid++;
	        }
	        else if(nums[mid] == 1)
	        {
	            mid++;
	        }
	        else{
	            swap(nums, mid, high);
	            high--;
	        }
	    }
	        return nums;
	} 
	private static void swap(int[] nums, int i, int j)
	{
	    int temp=nums[i];
	    nums[i]=nums[j];
	    nums[j]=temp;   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2,0,2,1,1,0};
		sortColors(nums1);
		int[] result=sortColors(nums1);
		for(int i=0; i< result.length; i++)
		{
			System.out.print(result[i]);
		}
	}

}
