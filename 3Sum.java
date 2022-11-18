// Time Complexity : O(n^2)
// Space Complexity :O(1)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        if(nums.length==0 || nums==null) return ans;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1,h=nums.length-1;
            while(l<h){    
                if(nums[i]+nums[l]+nums[h]==0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1]){
                    l++;
                    }
                    while(l<h && nums[h]==nums[h+1]){
                        h--;
                    }
                }else if(nums[i]+nums[l]+nums[h]<0){
                    l++;
                }else{
                    h--;
                }
                
            }
        }    
        return ans;
    }
}