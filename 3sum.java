// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : understood from the class


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums==null || nums.length<3)
            return new ArrayList<>();

        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2;i++)
        {
            if(i!=0&&nums[i-1]==nums[i])
                {continue;}
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    output.add(Arrays.asList(nums[i], nums[left],nums[right]));
                    left+=1;
                    right-=1;
                    while(left<right&&nums[left-1]==nums[left]){left++;}
                    while(left<right&& nums[right+1]==nums[right]){ right-=1;}}
                else if(sum<0){left+=1;
                        while(left<right&& nums[left-1]==nums[left]){left+=1;}}
                 else{right-=1;
                      while(left<right&& nums[right+1]==nums[right]){right-=1;}}}}  
    return output;    
}}
