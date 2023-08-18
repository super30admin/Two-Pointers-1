// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// burte Force/nested iteration : O(n^2), O(1)
// hashmap : O(n),O(n)
// 2 pointer : O(nlogn)+O(n)= O(n), O(n)
// Binary Search : O(nlogn)+O(logn)*n = O(nlogn),O(1)


//2 pointer
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new  ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;

        for(int i=0;i<n-2 ;i++) // i,l,r
        {
            if(nums[i] > 0){ //greater val -> not possible to find pairs
             break;
            }
            if(i>0 && nums[i]==nums[i-1]) continue; 

            int l = i+1, r = n-1;  
            while(l<r){
                int sum = nums[i]+ nums[l]+nums[r];
                if(sum==0){
                    List<Integer> list = Arrays.asList(nums[i],nums[l],nums[r]);
                    result.add(list);
                    l++;r--; //found so, search for remaining
                    //duplicates
                    while(l<r&& nums[l]==nums[l-1]) l++; 
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
                else if (sum>0){ 
                    r--;
                }
                else 
                  l++;
                }

            }
        return result;
    }
}




