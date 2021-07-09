// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
//         int[] freq = new int[3];
//         int index = 0;
        
//         for(Integer i : nums) {
//             freq[i]++;
//         }
//         System.out.println(Arrays.toString(freq));
//         for(int i = 0; i < freq.length; i++) {
//             for(int j = 0; j < freq[i]; j++) {
//                 nums[index++] = i;
//             }
//         }
        
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
                
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, high, mid);
                high--;
            }
        }
    }
    private void swap(int[] nums,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList();
        
        Arrays.sort(nums);
        
        
        for(int i = 0 ; i < nums.length; i++) {
            int left = i+1;
            int right = nums.length-1;
            
            if(i != 0 &&nums[i] == nums[i-1]) {
                continue;
            }
            while(left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if(currentSum < 0) {
                    left++;
                } else if(currentSum > 0) {
                    right--;
                } else{
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
            }
            
        }
        return result;
    }
}



// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no


class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = Integer.MIN_VALUE;
        
        while(low < high) {
            int area = (Math.min(height[low],height[high]))*(high-low);
            max = Math.max(area,max);
            if(height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
            
        }
        return max;
    }
}