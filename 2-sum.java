//Problem: 2 sum : solution by using hashset

// Time Complexity : o(n)
// Space Complexity :o(n) to store the values in the hashset
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int Value1 = 0;
        //hashset to store the visited values
        HashSet<Integer> set = new HashSet<Integer>();
        //array to store the result
        int[] arr = new int[2];
        //finding the pair for the target
        for(int i = 0; i < n; i++){
           int findValue = target - nums[i];
           //finding the value in the set if we find it we store the value in Value1 variable and the index of current value in the array which is going to be the second value in the result array.
           if(set.contains(findValue)){
               Value1 = findValue;
               arr[1] = i;
               break;
           }
           set.add(nums[i]);

        }
        //traversing the array to find the index of the first value in the result array
        for(int i =0; i<n;i++){
            if(nums[i] == Value1){
                arr[0] = i;
                break;
            }
        }
        return arr;
    }
}
