import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_3_Sum {
	//Approach: 1. I have sorted the numbers initially, to make sorting easier. Then iterate the array, with pointer i, to get sum as 0, we again use 2 pointers, low and high.
	//2. Everytime, we check the sum of the i, low, high values, if its equal to 0, we add it to the result or check the sum if its less than zero we increment low pointer to go for a bigger value
	//3. Else we decrement high pointer to get a lower value. With this, we also have to make sure to skip the same result.
	public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0 || nums == null)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        //sorting the numbers so to make search easier
        Arrays.sort(nums);
        for(int i=0;i< nums.length-2;i++)
        {
            if(i>0 && nums[i] == nums[i-1]) // skip same result
                continue;
            int low = i+1;
            int high = nums.length-1;
            while(low< high)
            {
                int sum = nums[i]+nums[low]+nums[high];
                if( sum == 0)
                {
                    List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low< high && nums[low] == nums[low-1])low++; // skip same result
                    while(low< high && nums[high] == nums[high+1])high--; // skip same result
                }
                else if(sum < 0 )
                {
                    low++;
                }else
                     high--;
            }
        }
        return result;
    }
}
//Time Complexity : O(n ^ 2) 
//Space Complexity : O(1) not consdiering the result arraylist 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :