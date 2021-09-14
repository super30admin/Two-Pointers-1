// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//o(n) time with constant space

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;  int mid = 0; int high = nums.length - 1;
        while(mid<=high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            } else if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;mid++;

            }else{
                mid++;
            }

        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

//n^2 time
//o(1) space

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int  low = i+1; int high = nums.length-1;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low], nums[high]);
                    result.add(li);
                    low++; high--;
                    while(low<high && nums[low] == nums[low-1] ) low++;
                    while(low<high &&  nums[high] == nums[high+1 ]) high--;
                }
                else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return result;


    }
}

//O(1) space and o(n) ttime

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length ==0) return 0;
        int max = 0;
        int low = 0; int high = height.length-1;
        while(low < high){
            max = Math.max(max, Math.min(height[low],height[high]) * (high-low));
            if(height[low] < height[high]){
                low++;
            } else{
                high--;
            }
        }
        return max;

    }
}