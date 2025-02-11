// Overall Time Complexity : O(n^2) . The time complexity involves O(nlogn+n^2)
// Overall Space Complexity : O(1) . There is no extra space used for computation.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation

// The solution to the program is to  finds all unique triplets in an array that sum to zero using sorting and a two-pointer approach.  
// First sort the array, then iterate the array keep  a fixed element while using two pointers on the rest of the elements to find valid triplets.  
// Duplicate elements are skipped to ensure unique triplets.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums == null || nums.length <3){
            return  res;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0 ; i<n-2; i++){
                if(nums[i]>0) break;
                if(i>0 && nums[i]==nums[i-1]) continue;
                int l = i+1;
                int r =n-1;
                while(l<r){
                    int curr = nums[l]+nums[i]+nums[r];
                    if(curr==0){
                        List<Integer> li = Arrays.asList(nums[l],nums[i],nums[r]);
                        res.add(li);
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l-1]){
                            l++;
                        }
                        while(l<r && nums[r]==nums[r+1]){
                            r--;
                        }
                    }else if (curr>0){
                        r--;
                    }
                    else{
                        l++;
                    }
                }


        }
        return res;
    }
    
}
