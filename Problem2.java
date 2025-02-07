import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time complexity o(n^2)
//Space complexity o(1);

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i< n-2;i++){
            if(nums[i] > 0) break;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int l = i+1; int r = n-1;
            while(l<r){
                int curr = nums[i] + nums[l] + nums[r];
                if(curr == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[l],nums[r]);
                    result.add(li);
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1]){
                        r--;
                    }
                }else if(curr > 0){
                    r--;
                }else{
                    l++;
                }
                
            }
        }
        return result;
    }
}