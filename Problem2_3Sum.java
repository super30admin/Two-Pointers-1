import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Sort the array to perform the two pointer approach
// Take ith index element as first number and perform two pointer approach to make the sum 0 on the remaining array
// If i==i+1 skip to the next index, if sum>0 reduce the right pointer else increase the left pointer
// If sum==0, increase l and reduce r - if l or r indeces are having the same elements skip until we get a different element

public class Problem2_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int l=i+1, r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }else if(sum>0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }
}
