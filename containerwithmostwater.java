//Objective of this program is to find out the container that can hold most water based on the heights array given.
//To find most water container we just need to get the max area covered from the given heights as the breadth and the difference in the indices l and r as the length for area
//Time Complexity: O(N)
//Space Complexity O(1)
class Solution {
    public int maxArea(int[] height) {
        //assign max area initially as 0
        int maxarea = 0;
        //left index at 0
        int l=0;
        //right index at last position of the given array
        int r=height.length-1;
        //Iterate through the array when left index < right index
        while(l<r)
        {
            //calculate maximum index by choosing the min heights among the 2 as the breadth and the diffrence between left and right index as the length of our area.
            //check if the calculated area is greater than the current maxarea and store the greater value
            maxarea = Math.max(maxarea,Math.min(height[l],height[r]) * (r-l));
            //Check if the height on the left index is lesser than the height on the right index
            if(height[l] < height[r])
            {
                //Increment the left index one place towards right
                l++;
            }
            else
            {
                //otherwise decrement right index one place to left
                r--;
            }
        }
        //return the maxarea
        return maxarea;
    }
}