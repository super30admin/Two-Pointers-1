/**
 * Time Complexity: O(n^2) where n = size of nums
 * Space Complexity : O(1)
 */

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length<3) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int low = i+1; int high = n-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                    
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
        
    }
    public static void main(String args[]){
        ThreeSum obj = new ThreeSum();
        int[] myArr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(obj.threeSum(myArr));
    }
}