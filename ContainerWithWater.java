// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class ContainerWithWater {
    public int maxArea(int[] height) {
    //base condition
        if(height.length < 2 || height == null){
            return 0;
        }
        int n =  height.length;
        int left = 0;
        int right =  n-1;
        int max = 0;
        while(left < right){
            max = Math.max(max, Math.min(height[left], height[right])* (right-left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}