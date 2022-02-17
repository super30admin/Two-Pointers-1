// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Declare 3 variable as 3 pointers to the array 
//Run loop on first variable
//Now run the logic of 2sum to find the complement of 1st pointer
//Store the values in list then add in list of list and return

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < len; i++){        
            int l = i + 1;
            int r = len - 1;
            int remain = -nums[i];
            while(l < r){
                int numl = nums[l];
                int numr = nums[r];
                int sum = numl + numr;
                if(sum == remain){
                    List<Integer> ll = new ArrayList<>();
                    ll.add(nums[i]);
                    ll.add(numl);
                    ll.add(numr);
                    result.add(ll);
                    while(l<r && nums[l] == numl)
                        l++;
                    while(l<r && nums[r] == numr)
                        r--;
                }
                else if(sum < remain){
                    l++;
                }
                else{
                    r--;
                }
            }
            while(i < len -2 && nums[i] == nums[i+1] )
            i++;
        }
        return result;
    }
}