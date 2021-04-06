// Time Complexity : O(n^2) n is the length of array
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Two pointer approach  
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            int left=k+1;
            int right=nums.length-1;
            if(k>0 && nums[k] ==nums[k-1]) continue;
            while(left<right){
                int sum=nums[left]+nums[right]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[left],nums[right],nums[k]));
                    left++;
                    right--;
                    while( left<right && nums[left]== nums[left-1]) left++;
                    while(left<right && nums[right]== nums[right+1]) right--;
                }else if(sum>0){
                    right--;
                }else  left++;
                
            }
            
        }
        return ans;
    }
}