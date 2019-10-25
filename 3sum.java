/*
Author: Akhilesh Borgaonkar
Problem: LC 15. 3Sum (Two-Pointers-1)
Approach: Using two-pointers approach here to find the pair of integers in the sub-array which sum up along with the iterating element to zero.
Time Complexity: O(n^2) where n is number of elements in input array
Space complexity: O(1) constant
verified on IDE.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int left=0, right=n-1;
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<n-2; i++){
            left = i+1;
            right = n-1;
            
            while(left < right){
                int currSum = nums[i]+nums[left]+nums[right];
                
                if((i==0 || nums[i]>nums[i-1]) && currSum == 0){
                    List<Integer> myList = Arrays.asList(nums[i], nums[left], nums[right]);
                    output.add(myList);
                    left++;
                    right--;
                    while(left<n-1 && nums[left]==nums[left-1])
                        left++;
                    while(right>left && nums[right]==nums[right+1])
                        right--;
                }
                else if((i==0 || nums[i]>nums[i-1]) && currSum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        
        return output;
    }
}