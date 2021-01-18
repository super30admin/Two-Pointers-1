// time of O(nlgn) and space constant
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution2 {
	 public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        if(nums == null || nums.length == 0 || nums.length<3)
	         return result;

	        Arrays.sort(nums);
	        int n = nums.length;
	        for(int i =0; i<n-2 ; i++){// Selecting a out of a+b+c
	            if((i>0)&& (nums[i-1]==nums[i])) continue;
	            int left = i+1;
	            int right = n-1;

	            while(left<right){
	                int sum = nums[i] + nums[left] + nums[right];
	                if(sum == 0){
	                    List<Integer> current = Arrays.asList(nums[i],nums[left],nums[right]);
	                    result.add(current);
	                    left++;
	                    right--;
	                while(left< right && nums[left] == nums[left-1])left++ ;//left side duplicates
	                while(left< right && nums[right] == nums[right+1])right-- ;//right side duplicates   
	                }else if(sum<0) // move right
	                    left++;
	                else 
	                    right--; // move left
	            }

	        }
	        return result;

	    }
	} 