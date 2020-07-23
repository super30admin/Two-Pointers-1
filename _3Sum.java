/****************************Brute force Approach***********************/
// Time Complexity : O(n^3)
// Space Complexity :
// Did this code successfully run on Leetcode : Yes (Time Limit Exceeded)
/*Iterating through each loop and getting first, second, third number and checking if their sum is equal to zero
 * If its zero, add the numbers in to list
 * while returning the result list, convert in to HashSet to get unique list of numbers*/

import java.util.*;

public class _3Sum {
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3)
            return res;
        
        Arrays.sort(nums);
        
        for(int i = 0 ; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                for(int k= j+1; k<nums.length; k++){
                    if((nums[i] + nums[j] + nums[k]) == 0){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        
                    }
                }
            }
        }
        res = new ArrayList<List<Integer>>(new HashSet<List<Integer>>(res));
		return res;
    }
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));
	}
}


/******************************************************************************/
//Time Complexity : O(n^2)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/* Used Sorting to obtain result and is solved in O(n^2) time.
 * Using two pointers low(pointing to the index after current number) and high (pointing to last number).
 * First, calculate the sum of these 3 numbers and if sum is equal to 0, append to result, and increment low and decrement high.
 * as array is sorted, if sum is less than 0, move to the right else move left
 * */
public class _3Sum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3)
            return result;
        
        Arrays.sort(nums);
        
        for(int i = 0 ; i< nums.length -2; i++){
            if(i > 0 && nums[i-1] == nums[i])		//nums[i-1] == nums[i] used for avoiding outer duplicacy, if nums[i] checked once, if same value occured at nums[i+1], move i to next value
                continue;
            
            int low = i+1;
            int high = nums.length-1;
            
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                
                if(sum == 0){
                    List<Integer> current = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(current);
                    low++;
                    high--;
                    
                    // used for avoiding inner duplicacy, since low, high changed, check base case again 
					// similar strategy for duplicacy removal in outer loop
                    while(low < high && nums[low] == nums[low - 1])
                        low++;
                    while(low < high && nums[high] == nums[high + 1])
                        high--;
                }
                else if(sum < 0)
                    low++;
                else 
                    high --;
            }
        }
        return result;
	}
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));
	}
}