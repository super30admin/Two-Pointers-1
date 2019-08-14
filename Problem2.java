// Time Complexity : O(N^3)
// Space Complexity : 
// Did this code successfully run on Leetcode : No, it showed time limit exceeded
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// This is a brute force solution which uses 3 loops.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // a+b=-c
         Arrays.sort(nums);
       List<Integer> l = new ArrayList<Integer>();
       // List<Integer> l = Arrays.asList(new Integer[10]);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]>0){
                    break;
                }
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        List<Integer> copy = new ArrayList<>(l);
                        
                        if(!list.contains(copy)){
                             list.add(copy);
                        }
                
                        
                       l.clear();
                         
                    }
                }
            }
        }
        return list;
    }
}
        
        