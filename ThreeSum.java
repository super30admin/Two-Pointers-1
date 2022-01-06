//Time Complexity O(n^2)
//Space Complexity O(1)

import java.util.*;
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //Brute force
        List<List<Integer>> result = new ArrayList();
        if(nums == null || nums.length == 0) return new ArrayList();
        Arrays.sort(nums); //nlog(n);
        int n = nums.length;
        
        for(int i = 0; i<n-2;i++){
            if(i!=0 && nums[i] == nums[i-1]) continue; 
           int low = i+1;
            int high = nums.length-1;
            while(low<high){
                int sum = nums[low]+nums[i]+nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;
                }
                else if(sum < 0){
                    low++;
                }else
                {
                    high--;
                }
                
            }
        }
        return result;
        
    }
}