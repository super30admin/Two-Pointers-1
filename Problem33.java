// TimeComplexity : O(n)
// SpaceComplexity : O(1)

// Approach:
//     Take 3 points : low,high & cur at indices 0,nums,length-1 & 0.
//     Loop through the nums and compare if element is 0, 1 0r 2.
//     if low elemet is 0 - low++ cur++
//     else if cur Element is 2 - swap it with high element - high--
//     else if cur Element is 0 - swap it with low element - mid++ cur++


class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int cur = 0;
        int high = nums.length-1;
        
        while(cur<=high){
            if(nums[low] == 0){
                low++;
                cur++;
            }
            
            else if(nums[cur] == 0){
                int temp = nums[low];
                nums[low] = nums[cur];
                nums[cur] = temp;
                cur++;
                low++;
            }
            else if(nums[cur] == 1){
                cur++;
            }
            else if(nums[cur] == 2){
                int temp = nums[high];
                nums[high] = nums[cur];
                nums[cur] = temp;
                high--;
            }
        }
    }
}