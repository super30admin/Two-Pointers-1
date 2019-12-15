/*
BRUTE FORCE SOLUTION
Algorithm:
    1. Traverse through the array, find collection of triplets whose sum is equal to 0.
    2. If the triplets sum is equal to 0 then add it to a list sort it and add it to the set to make sure duplicates are not present.
    3. Return the hashset values as a list.
    
    Time Complexity: O(n^3)
    Space Complexity: O(n);
    
    Did the solution run on leetcode? No(Time Limit Exceeded)


*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //Edge Case
        
        if(nums.length==0 || nums==null)
            return new ArrayList<>();
        
        HashSet<List<Integer>> set = new HashSet<>();
        
        int n = nums.length;
        
        for(int i=0; i< n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if((nums[i]+nums[j]+nums[k])==0){
                        List<Integer> newset = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(newset);
                        set.add(newset);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    
    
}