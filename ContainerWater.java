// Overall Time Complexity : O(n) . The time take iterate over the array
// Overall Space Complexity : O(1) . There is no extra space used for computation.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


// This solution involves maximizing the area where the maximum amount of water can be stored.
// We use height as the key factor in determining the maximum area.
// The two-pointer approach helps find the largest possible area between two lines that form a container.

public class ContainerWater {
    public int maxArea(int[] height) {
        if(height ==null || height.length < 2){
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int res = 0;

        while(left < right){
            int curr = Math.min(height[left],height[right]) * (right-left);
            res = Math.max(curr,res);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;

        
        
    }
}
