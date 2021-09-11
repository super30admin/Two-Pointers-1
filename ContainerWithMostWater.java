package TwoPointers1;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int max = 0;
        while(left < right){
            if(height[left]<height[right]){
                max = Math.max(max, height[left]*(right-left));
                left++;
            } else{
                max = Math.max(max, height[right]*(right-left));
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}