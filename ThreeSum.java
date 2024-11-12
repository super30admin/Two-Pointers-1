// Time Complexity :nlogn + O(n*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
         int n= nums.length;
         Arrays.sort(nums);

         for(int i=0; i<n; i++){
             if(i>0 && nums[i]==nums[i-1]) continue;
             if(nums[i]>target) break;
             int low=i+1, high = n-1;
             while(low<high){
                 int sum= nums[i]+nums[low]+nums[high];
                 if(sum==target){
                     res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                     low++;
                     high--;
                     while(low<high &&  nums[low]==nums[low-1]){
                         low++;
                     }

                     while(low< high && nums[high]==nums[high+1]){
                         high--;
                     }
                 }else if(sum<target){
                     low++;
                 }else{
                     high--;
                 }
             }
         }
         return res;
    }

    public static void main(String args[]) {
        ThreeSum prob= new ThreeSum();
        int[] nums= {-1,0,1,2,-1,-4,0,0};
        System.out.println(prob.threeSum(nums, 0));
    }
}
