// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum  {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0;i<n-2;i++){

            if(i!=0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r =n-1;
            int t = 0-nums[i];
            
            while(l<r){

                if(nums[l]+nums[r]==t){
                    result.add(new ArrayList<Integer> (Arrays.asList(nums[i],nums[l],nums[r])));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }else if(nums[l]+nums[r]<t){
                    l++;

                }else{
                    r--;
                }
            }
        }
        return result;
    }
}
