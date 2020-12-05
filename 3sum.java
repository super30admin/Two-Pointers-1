/*
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        if nums is None or len(nums) == 0:
            return result
        
        n = len(nums) - 1
        nums.sort()
        for i in range(n-1):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue
                
            low = i + 1
            high = n
                
            while low < high:
                adding_three = nums[i] + nums[low] + nums[high]
                
                if adding_three == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                    
                elif adding_three < 0:
                    low += 1
                
                else:
                    high -= 1
        return result
*/

// Time Complexity : O(n^2) where n is array size
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Maintained two pointers low and high and everytime checked the sum 
// for each input 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int low, high;
        int n = nums.length - 1;
        Arrays.sort(nums);
        for (int i=0; i < n; i++){
            if (nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            low = i+1;
            high = n;
            while (low < high){
                int sum = nums[i] + nums[low] + nums[high];
                
                if (sum == 0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low ++;
                    high --;
                    while (low < high && nums[low] == nums[low - 1]){
                        low ++;
                    }
                    while (low < high && nums[high] == nums[high + 1]){
                        high --;
                    }
                }else if (sum < 0){
                    low ++;
                }else {
                    high --;
                }
            }
        }
        return result;
    }
}
        