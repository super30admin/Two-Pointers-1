import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Approach: In this approach we sort the array firsr and then apply the two pointer technique. We set the first number of the triplet
//and we apply two sum using two pointers. We also check outside duplicates. Also we ignore the numbers greater than 0.
//Then if we find the sum zero in the inner loop then we add the triplet to the result. and increment low and decrement high. If we have the sum 
//greater than 0 then we need to go to the lower side so we decrement high otherwise increment low. 
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums == null || nums.length == 0) new ArrayList<>();
        Arrays.sort(nums);  //nlogn
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n;i++){  //n^2
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i]>0) break;
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    while(low < high && nums[low]== nums[low-1]){
                    low++;
                    }
                    while(low < high && nums[high]== nums[high+1]){
                        high--;
                    }
                }else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return result;
    }
}
