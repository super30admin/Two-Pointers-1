// Time Complexity :O(n^2logn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0; i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            continue;
            
            
            int target = 0-nums[i];
            int l=i+1;
            int h=nums.length-1;
            while(l<h)
            {
                
                int sum = nums[l] + nums[h];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[h]));
                

                while(l<h && nums[l]==nums[l+1])
                {
                     l++;
                }
               

                while(l<h && nums[h]==nums[h-1]){

                        h--;
                }
                

                l++;
                h--;
                }

               else if(sum<target)
                {
                l++;
                }
                
                else 
                {
                h--;
                }
            }
            
        }
        return result;
    }
}