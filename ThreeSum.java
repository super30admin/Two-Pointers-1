package s30Coding;
import java.util.*;

//Time Complexity :- O(n^2)

//Space Complexity :- O(1)

//LeetCodee :- Yes

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3) return result;
        Arrays.sort(nums);
        for(int i  = 0; i< nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int low = i +1, high = nums.length -1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    high--;
                    low++;
                    while(low < high && nums[low] == nums[low-1] ) low++;
                    while(low < high && nums[high] == nums[high+1] ) high--;
                }
                else if(sum > 0){
                  high--;  
                }
                else{
                    low++;
                }
            }
        }
        return result;
    }
}
