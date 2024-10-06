// Problem #1: Sort colors (0, 1, 2)
// Time Complexity:  O(N)
// Space Complexity: O(1)
// Algorithm: 3 pointer approach with low for 0, mid for 1 and high for 2
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = n-1, high = n-1;

        while(mid >=  low){
            if (nums[mid] == 2){
                swap(nums, mid, high);
                high--;
                mid--;
            }
            else if (nums[mid] == 0){
                swap(nums, mid, low);
                low++;
            }
            else{
                mid--;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// Problem #2: 3 Sum
// Time Complexity:  O(N logN) (sort) + O(N^2 LogN) (loop through list for each number + binary search) --> O(N2 LogN) 
// Space Complexity: O(1)
// Algorithm: 2 Sum algorithm for each number where input to 2sum would be target - cur_num 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //sort array once
        int n = nums.length;
        Arrays.sort(nums);
        // 2 pointer approach n times

        int target = 0; //in this case

        for (int i = 0; i < n-2; i++){
            if (i>0 && nums[i] == nums[i-1]) continue; //ie the same number and we dealt with it in prev iteration
            if (nums[i] > target) break; // since the numbers are sorted and we reached number > target it is 
                                        //impossible to find a pair of numbers that add up to our target. 
            int low  = i+1, high = n-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]){//skip over duplicate numbers while low < high  
                                                                //(ie not crossing boundaries)
                        low++;
                    }
                    while(low< high && nums[high] == nums[high+1]){
                        high--;
                    }
                }
                else if (sum < target){
                    low++;
                }
                else{ // ie. sum > target
                    high--;
                }
            }
        }
    return result;
    }
}
// Problem #3: Container with most Water (https://leetcode.com/problems/container-with-most-water/)
// Time Complexity: O(N)
// Space Complexity: O(1)
// Algorithm: 2 pointer approach --> caluclate max at each step --> move the pointer with lower height --> return height when pointers cross each other
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int low = 0, high = n-1, max = 0;

        while(low < high){
            int func_height = Math.min(height[low], height[high]);
            int area = (high - low) * func_height;
            max = Math.max(area, max);

            if (height[low] > height[high]){
                high--;
            }
            else{
                low++;
            }
        }
        return max;
    }
}

