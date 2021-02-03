// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
    //Sort the array
    //Find the sum of three pointers,if it is greater than zero decrease last pointer else increase first pointer.
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3)
            return new ArrayList<>(0);
            
            Arrays.sort(nums);
            
    
            List<List<Integer>> out = new ArrayList<>();
            for(int i=0;i<nums.length-2;i++)
            {
                if(i!=0 && nums[i-1]==nums[i])
                    continue;
            
                    int j=i+1;
                    int k=nums.length-1;
                while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                
                 if(sum==0)
                    {
                        out.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                    
                    while(j<k &&  nums[j-1]==nums[j])
                    {
                        j++;
                    }
                    while(j<k && nums[k+1]==nums[k])
                    {
                        k--;
                    }
                 }
                else if(sum<0)
                {
                    j++;
                    while(j<k  && nums[j-1]==nums[j])
                    {
                        j++;
                    }
                }
                else
                {
                    k--;
                     while(j<k && nums[k+1]==nums[k])
                    {
                        k--;
                }
                
                }
            }
            }
            return out;
        }
            
           
        }
    
