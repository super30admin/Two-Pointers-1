// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: The brute force solution would be using 2 for loops, but it is a unoptimized version since it will have O(n*2) TC hence causing Time limit exceeded error, I am using two pointer approach to eliminate the iteration over all the elements yeilding less area for water storage thus reducing the TC to O(n)


class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0) return 0;
        int n = height.length;
        int low = 0;
        int high = n-1;
        int max = 0;
        while(low<high){
            int currArea = (high-low)*Math.min(height[low],height[high]);
            max = Math.max(max, currArea);
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
}