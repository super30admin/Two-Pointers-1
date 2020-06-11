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



class Solution {
    // Time Complexity : O(length of nums ^ 2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
2 pointers 
1. sort array and use 2 pointers
2. for every elelemnt, find complement and then use 2 pointers to find 2sum of complement.
*/

// Your code here along with comments explaining your approach
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int cp = (0-nums[i]);
            int low = i+1; int high = nums.length-1;
            while(low<high){
                int sum = nums[low]+nums[high];
                if(sum == cp){
                    List<Integer> l = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(l);
                    low++; high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(sum < cp){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}