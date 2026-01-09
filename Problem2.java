import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        if(nums== null || nums.length<3) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]>0) break;
            //for external duplicacy
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1; int r=n-1;
            while(l<r){
                int sum= nums[i]+nums[l]+nums[r];
                if(sum==0){
                    //get the triplet
                    List<Integer> li= Arrays.asList(nums[i],nums[l],nums[r]);
                    result.add(li);
                    l++;
                    r--;
                    //for internal duplicacy check
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;

                }
                else if(sum>0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return result;
        
    }
}