//15. 3Sum
//Time Complexity :O(n^2) as iterating through all n elements
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
//output: [-1, -1, 2][-1, 0, 1]


import java.util.*;

public class threeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0 || nums == null) return new ArrayList<>(); // returning empty list
            
        //sort the given array to solve by 2 pointer
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left=i+1;
            int right=nums.length -1;
            while(left<right){
            int sum= nums[i]+nums[left]+nums[right];
            
            if(sum>0)
            {
                right--;
            }
            else if(sum<0)
            {
                left++;
            }
            else{  // if sum == 0
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while(left<right && nums[left] == nums[left-1]){
                    left++;
                }
                while(left<right && nums[right] == nums[right+1]){
                right--;
                } 
            }
        }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums= {-1,0,1,2,-1,-4};
		List<List<Integer>> result1=new ArrayList<>();
		result1=threeSum(nums);
		for(List<Integer> i:result1) {
			System.out.print(i);
		}

	}

}
