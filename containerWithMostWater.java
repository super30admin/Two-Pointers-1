// Time Complexity: we are traversing whole array to identify maximum area using 2 pointers => O(n)
// Space complexity: No additional data structure used => O(1)
// Did you complete it on leetcode: Yes
// Any problem faced: Made a bit complex by performing unnecessary area calculation and comparisons even when we found a lesser height, caused time limit exceeded.

// Write your approach here
// Idea here is to perform an area calculation by taking the minimum height of left and right pointer and multiply with the difference of their indexes.
// once started from 0 and length of array, we can check if left is smaller or right is smaller  as holding the bigger number will aid in possibly greater area.
// if left is smaller increment left pointer else decrement right pointer and make calculation to get maximum area.
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length<2) {
            return 0;
        }
        int maxVol = 0;
        int h = height.length-1;
        int l=0;
        while(l<h) {
            int currVol = Math.min(height[l], height[h]) * (h-l);
            maxVol = Math.max(maxVol, currVol);
            if(height[l]<height[h]){
                l++;
            } else {
                h--;
            }
        }
        return maxVol;
    }
}