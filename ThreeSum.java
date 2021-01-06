// Time Complexity : The time complexity is O(n^2) where n is the length of the array
// Space Complexity : The space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> output = new LinkedList<>();
        Arrays.sort(nums);

        if(nums.length == 0){
            return output;
        }

        int n = nums.length;

        for(int i=0;i<n-2;i++){

            // To avoid duplicates
            if(i !=0 && nums[i] == nums[i-1]){
                continue;
            }
            int sum = 0-nums[i];
            int start = i+1;
            int end = n-1;

            // Maintain 2 pointers for the remaining sorted array
            while(start < end){

                // If sum is 0, found the triplet
                if(nums[start]+nums[end] == sum){
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    output.add(list);
                    while(start<n-1 && nums[start]==nums[start+1]){
                        start++;
                    }
                    start++;
                    while(end > i && nums[end]==nums[end-1]){
                        end--;
                    }
                    end--;
                }
                // If sum is less than zero, more the increment the start
                else if(nums[start]+nums[end] < sum){
                    while(start<n-1 && nums[start]==nums[start+1]){
                        start++;
                    }
                    start++;
                }
                // If sum is greater then zero, decrement the end
                else{
                    while(end > i && nums[end]==nums[end-1]){
                        end--;
                    }
                    end--;
                }
            }
        }

        return output;

    }
}