import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            if(nums == null || nums.length <3){
                return new ArrayList<>();
            }

            List<List<Integer>> sumlist = new ArrayList<>();
            Arrays.sort(nums);
            int n = nums.length;
            for(int i=0;i<n;i++){
                if(i != 0 && nums[i] == nums[i-1]){
                    continue;
                }
                int left = i+1, right = nums.length-1;
                while(left < right){
                    int tsum = nums[i]+nums[left]+nums[right];
                    if(tsum == 0 ){
                        sumlist.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left -1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right+1]){
                            right--;
                        }
                    }else if( tsum < 0){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
            return sumlist;
        }
}
