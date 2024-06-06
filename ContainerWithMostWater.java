//Time - O(n)
//Space - O(1)
class ContainerWithMostWater {
    public int maxArea(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int n = nums.length;
        int low = 0, high = n-1;
        int max = 0;

        while(low < high){
            max = Math.max(max, Math.min(nums[low],nums[high])*(high-low));
            if(nums[low] < nums[high]){
                low++;
            } else {
                high--;
            }
        }

        return max;
    }
}