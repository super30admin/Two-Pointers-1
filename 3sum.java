// Time Complexity : O(n^2)
// Space Complexity : O(1) Ignoring the Output list
// Did this code successfully run on Leetcode : Yes 
// Three line explanation of solution in plain english 

/*
Using Two pointer approach to traverse in an array to find list of list of 3 elements each to form a sum  = 0.
Keeping the third pointer array seperator, i will be incremented everytime to perform two pointer approach which gives the sum of 2 elements 
equal to negation of already existing element i. This gives the 3 list sum equal to zero.
*/

// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
      // Sort the array before traversing so that we can search for the target using sum
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
          // This line handles the duplicate values
            int left = i+1,right=nums.length-1;
          // Two pointer approach as left is updates as i+1 every time and right as end always
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left] == nums[left+1]) left++;
                    while(left<right && nums[right] == nums[right-1]) right--;
                  // Handles duplicate elements repeated in the set
                    left++;
                    right--;
                }
                else if(sum > 0) right--;
                else left++;
            }     
        }
        return result;
    }
}
