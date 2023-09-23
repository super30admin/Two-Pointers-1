                      // Sort Colors

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Was getting confused on how to move low and mid pointers on each iteration, but understood after watching the lecture again

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else mid++;
        }

    }
}


                      // 3 Sum

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Understood the main concept of the solution, just took some time to figure out how to avoid duplicate conditions

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> addList = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(i > 0 && nums[i] == nums[i-1]) // very important addition, helps to eliminate duplicates
                continue;
            int left = i+1, right = n-1;
            while(left < right){
                int cur = nums[i] + nums[left] + nums[right];
                if(cur == 0){
                    list.add(Arrays.asList(nums[i], nums[left],nums[right]));
                    // skip duplicates of left, left++ until new element is found
                    while(left < right && nums[left] == nums[left+1]) 
                        left++;
                    // skip duplicates of right, right-- until new element is found
                    while(left < right && nums[right] == nums[right-1])
                        right--;
                    left++; // move both pointers to the next element of their duplicate, if any
                    right--;
                }
                else if(cur < 0)
                    left++;
                else right--;     
            }
        }
        return list;
    }
}

                     // Container with most water

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] nums) {

        // as width gets shorter, our aim is to make walls higher, so we keep the taller wall among 
        // the 2 pointers and move the shorter one so as to not loose the longer wall.

        int left = 0, right = nums.length-1;
        int maxArea = 0;
        while(left < right){
            int area = (right - left) * Math.min(nums[left], nums[right]);
            if(area > maxArea)
                maxArea = area;
            if(nums[left] > nums[right])
                right--;
            else left++;
        }
        return maxArea;
    }
}
