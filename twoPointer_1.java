public class twoPointer_1 {
    //Container with most water
    class Solution {
        public int maxArea(int[] height) {
            if(height == null || height.length == 0)
                return 0;
            int low = 0 , high = height.length-1;
            int maxArea = 0;
            while(low < high){
                //calculate area
                int currentContainer = (high - low)* Math.min(height[low],height[high]);
                //updating area
                maxArea = Math.max(maxArea, currentContainer);
                if(height[low] <= height[high]){
                    low++;
                }
                else{
                    high--;
                }
            }
            return maxArea;
        }
    }

//The time complexity is O(N).
//The space complexity is O(1).
}

//Sort colors

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int[]nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}

//The time complexity is O(N).
//The space complexity is O(1).

//Three sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> solution = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length && nums[i] <= 0; i++) {
            if(i > 0 && nums[i-1] == nums[i])
                continue;
            int start = i+1;
            int end = nums.length - 1;
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0) {
                    ArrayList<Integer> val = new ArrayList<>();
                    val.add(nums[i]);
                    val.add(nums[start]);
                    val.add(nums[end]);
                    solution.add(val);
                    start++;
                    end--;
                    while(start < nums.length && nums[start] == nums[start-1])
                        start++;
                } else if(sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return solution;
    }
}
//The time complexity is O(N).
//The space complexity is O(1).
