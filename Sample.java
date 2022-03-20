// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I don't know why the other swapping method is not working. Please explain why it is not working with that


// Your code here along with comments explaining your approach
//sort colors
class Solution1 {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums, mid, low);
                mid++; low++;
            }
            else
                mid++;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        //nums[i] = nums[i] + nums[j];
        //nums[j] = nums[i] - nums[j];
        //nums[i] = nums[i] - nums[j];
    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
            
        for(int i=0; i < n-2; i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int low = i+1; int high = n-1;
            while(low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if(sum == 0) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(temp);
                    low++; high--;
                    
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                    
                } else if(sum < 0)
                    low++;
                else
                    high--;
            }
        }
        return result;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution3 {
    public int maxArea(int[] height) {
        if(height == null || height.length ==0)
            return 0;
        int n = height.length;
        int max = 0;
        int p1 = 0; int p2 = n-1;
        while(p1 != p2) {
            max = Math.max(max, Math.min(height[p1], height[p2]) * (p2-p1));
            if(height[p1] > height[p2])
                p2--;
            else p1++;
        }
        return max;
    }
}