// Time Complexity : O(n ^ 2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //We store all unique results
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        if(nums == null || n < 3)
            return result;

        //first we sort the array, so we can skip similar numbers as they will give same answer and we need unique ans
        Arrays.sort(nums);

        //We will select an element i and perform (0 - nums[i])
        for(int i = 0; i < n - 2; i++) {

            //Our target sum = 0, and since array is sorted if nums[i] > 0, next numbers would be def > 0
            if(nums[i] > 0)
                break;

            //if nums[i] and nums[i+1] are same then we will again get similar ans so we will skip computation
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

                //we will perform 2 sum for the target in the remaining part of array
                int left = i + 1;
                int right = n - 1;

                //If nums[left] > target then result will always be > target as array is sorted
                while(left < right) {

                    int cur = nums[i] + nums[left] + nums[right];

                    //if we found the pair of numbers
                    if(cur == 0) {

                        List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                        result.add(list);
                        left++;
                        right--;
                    //if the next element is similar to prev element just ignore as we will get same ans and we unique ans 
                        while(left < right && nums[left] == nums[left - 1])
                            left++;

                        while(left < right && nums[right] == nums[right + 1])
                            right--; 
                    }

                    else if(cur < 0) {

                        left++;
                    }

                    else {
                        right--;
                    }            
                }

        }
        
        return result;
    }
}