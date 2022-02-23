// Time Complexity :O(NlogN+N^2) n is number of elements
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//Take three pointers and firx one of them on first element and then find sum =target-first pointer using two pointers to calculate required sum


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0;i<nums.length;++i){
            
            if(i!=0&&nums[i]==nums[i-1])    
                continue;
            
            int l=i+1,r=nums.length-1;
            while(l<r){
                int currSum=nums[i]+nums[l]+nums[r];
                if(currSum==0){
                    
                    List<Integer> temp=Arrays.asList(nums[i],nums[l],nums[r]);
                    Collections.sort(temp);
                    result.add(temp);
                    ++l;
                    --r;
                    
                    while(l<r&&nums[l]==nums[l-1]){
                        ++l;
                    }
                    
                     while(l<r&&nums[r]==nums[r+1]){
                        --r;
                    }
                    
                }else if(currSum<0){
                    ++l;
                    
                }else{
                    --r;
                }  
                
            }
            
            
        }
        return result;
    }
}