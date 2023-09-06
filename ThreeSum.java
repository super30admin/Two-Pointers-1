//TC: O(N^2) SC: O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n-2; i++) {
            if(nums[i] > 0) break;
            //outside duplicacy
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = n-1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[l], nums[r]);
                    res.add(li);
                    l++;
                    r--;
                    //internal duplicacy
                    while(l<r && nums[l] == nums[l-1]) l++;
                    while(l<r && nums[r] == nums[r+1]) r--;
                } else if(sum < 0) l++;
                else r--;
            }
        }
        return res;
    }
}