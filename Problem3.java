//We use Two Pointer technique.
//
//Key idea:
//Area = height × width
//Width = high - low
//Height = minimum of two heights
//To maximize area:
//Move the pointer with smaller height
//Because moving taller height cannot increase area
//
//Time: O(n)
//Space: O(1)

class Solution {

    public int maxArea(int[] height) {


        // Length of array
        int n = height.length;


        // Two pointers: start and end
        int low = 0;
        int high = n - 1;


        // Variable to store maximum area
        int area = 0;



        // Traverse until pointers meet
        while(low < high) {


            // Width between two lines
            int w = high - low;


            // Variable to store minimum height
            int h = 0;



            // Move pointer with smaller height
            if(height[low] < height[high]) {

                // Height is limited by smaller line
                h = height[low];

                // Move left pointer right
                low++;
            }


            else {

                // Height is limited by smaller line
                h = height[high];

                // Move right pointer left
                high--;
            }



            // Calculate area and update maximum area
            area = Math.max(area, h * w);
        }



        // Return maximum water area
        return area;
    }
}