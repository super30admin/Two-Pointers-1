//minmax.java
// Time Complexity :O(n*m) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0 || nums==null)
        {
            return result; // empty arraylist
        }
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int left=i+1, right=n-1;
            if(nums[i]>0) //when the element is greater than 0 there is no way to find its zero pair
                break;
            if(i>0 && nums[i]==nums[i-1])
                continue;
            while(left<right)
            {
                int curr=nums[i]+nums[left]+nums[right];
                if(curr==0)
                {
                    List<Integer> out=Arrays.asList(nums[i],nums[left],nums[right]);
                    result.add(out);
                    left++;
                    right--;
                    while(left<right && nums[left-1]==nums[left]) //moving away from duplicates
                        left++;
                    while(left<right && nums[right+1]==nums[right])//moving away from duplicates
                        right--;
                }
                if(curr>0)
                    right--;
                if(curr<0)
                    left++;
                
            }
        }
        return result;
        
        
    }
   
}