//Leetcode: 11 - https://leetcode.com/problems/container-with-most-water/description/

// Time Complexity = O(n)
// Space Complexity = O(1) No Auxiliary space is used.
// Does it run on LeetCode successfully? = Yes
// Any difficulties: Not for this.
/*


*/

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 1;
        int n = height.length;
        int low = 0;
        int high = n-1;
        int currArea;
        int st =0, end = 0;
        while(low<high){
            currArea = Math.min(height[low],height[high]) * (high-low);
            if(maxArea <= currArea) {
                maxArea = currArea;
                //If problem is asking for indices to print, return then
                st = low;
                end = high;
            }
            if(height[low] <= height[high]) {
                low++;
            }else {
                high--;
            }
        }

        System.out.println("Start : " + st + " End : " + end);
        System.out.println("maxArea : " + maxArea);
        return maxArea;
    }
    public static void main(String[] args){
        ContainerWithMostWater obj = new ContainerWithMostWater();
        obj.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
}