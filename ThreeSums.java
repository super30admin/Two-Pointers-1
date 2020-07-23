/**
Problem: Three Sum
Time Complexity : O(n^2), where n is the length of the nums array
Space complexity : O(1), except for the returning list, we don't make use of any additional space.

Did the code run on LeetCode: Yes

Approach: 2 pointers.
1. Sort the array first.
2. We make use of two pointers, low and high, with low pointing to the index after current element, and high pointing to the last element.
3. We calculate the sum of these 3 numbers first. If the sum is 0, we append it to the result list, and increment the low pointer, and decrement the high pointer.
4. We know that if sum is less than 0, (because the array is sorted), we need to keep moving right. Otherwise, we move to the left.


*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3) return list;
        Arrays.sort(nums); //sort the array first.
        for(int i = 0 ; i < nums.length - 2; i++) {
            if(i > 0 && nums[i-1] == nums[i]) { //check for duplicates
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    List<Integer> currList = Arrays.asList(nums[i],nums[low],nums[high]);
                    list.add(currList);
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]) {
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]) {
                        high--;
                }
            }
                else if (sum < 0) {
                    low++;
                }
                else if(sum > 0) {
                    high--;
                }
        }
            
    }
        return list;
    }
}