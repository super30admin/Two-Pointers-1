import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Time Complexity : O(N2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
public class threeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if(nums == null || nums.length ==0) return result;
            Arrays.sort(nums);
            int n=nums.length;
            for(int i=0; i<n-2; i++) {
                //outside duplicacy
                if(i!=0 && nums[i]==nums[i-1]) continue;
                //two pointer for rest of array

                int low = i+1;
                int high = n-1;
                while(low<high) {
                    int sum = nums[i]+nums[low]+nums[high];
                    if(sum ==0) {
                        List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                        result.add(li);
                        low++;
                        high--;
                        //inside duplicacy
                        while(low<high && nums[low]==nums[low-1]) {
                            low++;
                        }
                        while(low<high && nums[high]==nums[high+1]) {
                            high--;
                        }
                    }
                    else if(sum< 0) {
                        low++;
                    }
                    else {
                        high--;
                    }
                }
            }
            return result;
        }
    }
}
