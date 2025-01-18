//TC: O(n^2)
//SC: O(1)
//approach: iterate over array, and inside each iteration, run two sum using 2 pointers

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] > 0){
                break;
            }
            int l = i+1;
            int r = nums.length-1;

            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    List<Integer> tr = new ArrayList<>();
                    tr.add(nums[i]); tr.add(nums[l]); tr.add(nums[r]);
                    result.add(tr);
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1]){
                        r--;
                    }
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }

        }
        return result;
    }
}
