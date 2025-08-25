//Time Complexity: O(n)
//Space Complexity: O(1)
//Did this code successfully run on Leetcode : Yes
//did you face any problem while coding this : No

/**
 * At any point of time the length must be maximized by having the distance between the vertical lines as maximum.
 * At the same time the height must be maximized by keeping in mind that breadth would be the minimum of the two heights of the chosen vertical lines.
 * We use two pointers, one starting at the beginning and the other at the end of the array.
 * We calculate the area formed by the lines at these two pointers using length*breadth which is the area of a rectangle .Further, we keep track of the maximum area found so far.
 */
class maxArea {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int area=0;
        int breadth=0;
        while(low<=high)
        {
            int length=high-low;
            if(height[low]<height[high])
            {
                breadth=height[low];
                low++;
            }
            else 
            {
                breadth=height[high];
                high--;
            }
            area=Math.max(area,length*breadth);
           
        }  
        return  area;


        
    }
}