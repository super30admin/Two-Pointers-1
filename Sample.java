// Time Complexity : O(N^2)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new LinkedList();
        
        for (int i = 0; i < nums.length - 2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int low = i + 1;
                int high = nums.length - 1;
                int s = 0 - nums[i];
                while(low < high){
                    if (nums[low] + nums[high] == s){
                        output.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1])
                            low ++;
                        while (low < high && nums[high] == nums[high - 1])
                            high --;
                        low ++;
                        high --;
                    }
                    else if (nums[low] + nums[high] > s)
                        high --;
                    else
                        low ++;
                }
            }
        }
        return output;
    }
}


//Time complexity: O(N)
//Space complexity : O(1)

class Solution {
    public void sortColors(int[] nums) {
      
          int low = 0, mid = 0, high = nums.length -1;
           while (mid <= high) {
               if (nums[mid] == 0){
                   swap(nums,low,mid);
                   low++;
                   mid++;
               }
               else if(nums[mid] == 2){
                  swap(nums,mid,high);
                  // mid++;
                   high--;
               }
               else {
                   mid++;
               }
           }
    }
        private static void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
        }



//Time complexity: O(N)
//Space complexity: O(1)

class Solution {
    public int maxArea(int[] a) {
        
        int maxWater = Integer.MIN_VALUE;
        
        int start = 0; 
        int end = a.length-1;
        
        while(start < end) {
            
            maxWater = Math.max(maxWater, Math.min(a[start], a[end]) * (end - start));
            
            if(a[start] < a[end]) {
                
                int startLen = a[start];
                do {
                    start++;
                } while(a[start] < startLen);
            
            } else if (a[start] > a[end]) {
                
                int endLen = a[end];
                do {
                    end--;
                } while(a[end] < endLen);
            } else {
                start++;
                end--;
            }
        }
        
        return maxWater;
    }
}




