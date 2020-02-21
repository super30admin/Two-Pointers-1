// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ThreesumOptimized {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i;
        int low;
        int high;
        List<List<Integer>> result = new LinkedList<>();
        for(i=0;i<nums.length-2;i++){

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            low = i+1;
            high = nums.length-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if (sum==0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;

                    while(low<high &&nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high &&nums[high]==nums[high+1]){
                        high--;
                    }

                }
                else if(sum>0){
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