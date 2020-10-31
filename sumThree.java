import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        if(nums == null || nums.length == 0){
            return l;
        }
        int n = nums.length - 1;
        int sum = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int low = i + 1, high = n;
            if( i > 0 && nums[i] == nums[i-1]) continue;
            while(low < high){
                sum = nums[i] + nums [low] + nums[high];
                if(sum == 0){
                    l.add(Arrays.asList(nums[i], nums[low] , nums[high]));  
                    low++; high--;
                     while(low < high && nums[low] == nums[low -1]) low++;
                     while(low < high && nums[high] == nums[high+1]) high--;
                }else if(sum > 0){
                    high--;
                }else{
                    low++;
                }

            }
        }
        return l;                
    }
}