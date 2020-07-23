// Time Complexity :O(n)
//      n: number of elements
// Space Complexity :O(1)
//      using in-place
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Using low, current, high as pointers
// elements to left of low are 0
// elements to right of high are 2
class Problem1 {
    public void sortColors(int[] nums) {
        
        // initialize
        int low = 0;
        int current = 0;
        int high = nums.length-1;
        
        // iterate
        while(current<=high){
            
            // current element is 0 swap with low
            if(nums[current]==0)
            {
                // swap
                int temp = nums[current];
                nums[current] = nums[low];
                nums[low] = temp;

                // increment
                current++;
                low++;
            // current element is 2 swap with high
            }else if(nums[current]==2){
                
                // swap
                int temp = nums[current];
                nums[current] = nums[high];
                nums[high] = temp;
                //decrement high only since current now can be 0
                high--;
            }else{
            
                current++;
            }
        }
        
    }
}