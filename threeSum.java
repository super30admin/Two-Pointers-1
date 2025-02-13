//Time Complexity: O(n^2)
//Space Complexity: O(1)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums==null || nums.length<3) return result;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n-2; i++){ 
            if(nums[i]>0) break;
            //outside duplicacy check
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l = i+1;
            int r = n-1;
            while(l<r){
                int cur = nums[i]+nums[l]+nums[r];
                if(cur == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[l], nums[r]);
                    result.add(li);
                    l++;
                    r--;
                    //duplicacy check inside
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1]){
                        r--;
                    }
                }
                else if(cur>0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return result;
    }
}