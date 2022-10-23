package S30_Codes.Two_Pointers_1;

// Time Complexity : O(n) // n = nums.length
// Space Complexity : O(1)
// Two-Pointers-1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        int idx1 = 0;

        while(idx1 < n-2){

            int l = idx1+1, r=n-1;

            while(l < r){

                int sum = nums[idx1] + nums[l] + nums[r];

                if(sum == 0){
                    result.add( Arrays.asList(nums[idx1], nums[l], nums[r]) );
                }
                if(sum <= 0){
                    l++;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
                else{
                    r--;
                    while(l<r && nums[r] == nums[r+1]){
                        r--;
                    }
                };
            }

            idx1++;
            while(idx1<n-2 && nums[idx1] == nums[idx1-1]){
                idx1++;
            }
        }
        return result;
    }
}