class Solution {
    // Time Complexity : O(length of nums ^ 3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Time Limit Exceeding
// Any problem you faced while coding this :

/*
Bruteforce
1. take complement of 0 at each num, then checking the sum of any other indices nums value as complement
2. if complement, add them to list and sort(so that duplicate checking is possible)
*/

// Your code here along with comments explaining your approach
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i =0; i<nums.length; i++){
            int cp = (0-nums[i]);
            for(int j =0;j<nums.length;j++){
                if(j!=i){
                    for(int k =0;k<nums.length;k++){
                        if(j!=k && i!= k){
                            if(nums[j]+nums[k] == cp){
                                List<Integer> l = new ArrayList<>();
                                l.add(nums[i]);
                                l.add(nums[j]);
                                l.add(nums[k]);
                                Collections.sort(l);
                                if(!result.contains(l)){
                                    result.add(l);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}