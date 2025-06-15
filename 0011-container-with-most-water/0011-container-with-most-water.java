// class Solution {
//     public int maxArea(int[] height) {
//         /*
//         Approach:
//         -Problem: Given an array where each element represents height of a vertical line at that index,
//         find two lines such that together with the x-axis they form a container, and it holds the maximum amount of water.

//         -Brute Force Strategy:
//         -> Try all pair of lines(i,j) such that i<j.
//         -> The area between two lines is determined by:
//          min(height[i], height[j]) *(j-i)
//          (ie., the shorter line limits the height of water,
//          and the distance between the lines is the width).

//          -For each pair, calculate this area and keep track of the maximum found.

//          -This brute-force approach has Time Complexity O(n^2), which leads to TLE (Time Limit Exceeded)
//          for large inputs. It's not optimal for big datasets.
//         */


//             int n = height.length; //Get the length of the height array
//             int area = 0; //Initialize variable of the maximum area found

//             //Outer loop to pick the first line (left boundry)
//             for(int i = 0; i<n; i++){
//                 //Inner loop to pick the second line (right boundary)
//                 for(int j =i+1; j<n; j++){
//                     //Find the height of the container using the shorter of the 2 lines
//                     int h = Math.min(height[i], height[j]);

//                     //Width is the distance between the two indices
//                     int w=j-i;

//                     //Calculate area for current pair
//                     int currentArea = h*w;

//                     //Update max area if this one is larger
//                     area = Math.max(area, currentArea); 
//                 }
//             }
//             return area; //Return the largest area
//     }
// }

// /*
// Time Complexity:
// -O(n^2): Two nested loops iterating over all possible pairs of lines
// -This is not possible for large inputs and may lead to TLE

// Space Complexity:
// -O(1): Constant extra space. We only use variables for area calculation
// */

class Solution{
    /*
    Approach:
    -This is an optimized two-pointer solution for the "Container With Most Water" problem.
    Idea:
    1. Start with two pointer : one at the beginning ('low') and one at the end('high') of the array.
    2. At each step, calculate, the area between the lines at these two poijnters.
        Area = min(height[low], height[height]) *(high-low)
    3. Update the maximum area if current area is greater.
    4. Move the pointer pointing to the shorter line inward, hoping to find a taller line that may increase the area (since width is reducing).
    5. repeat untill 2 pointers meet.
    */
    public int maxArea(int[] height){
        int n = height.length; //Get the number of vertical lines

        int low = 0, high =n-1; //Initialize 2 pointers : low at start, high at end
        int area = 0; //Variable to tract the maximum area

        //Continue until the 2 pointer meet
        while(low<high) {
            int h = 0; //Height of the water container
            int w= high-low; //Width is the distance between the 2 poiunters


                //Determine which line is shorter
                if(height[low] < height[high]){
                    h = height[low]; //Height is limited by the shorter line
                    low++; //Move left pointer rightwards to look for a taller line
                }
                else{
                    h = height[high]; //Height is limited by the shorter line
                    high--; //Move right pointer leftwards to look for a taller line
                }

                //Calculate area which the current pair and update max area if larger
                area = Math.max(area, h*w);
            }
            return area;
    }
}

/*
Time Complexity:
O(n) : Each pointer moves at most n steps (from opposite ends to center).
-Every step involves O(1) work (comparison, multiplication, update).

Space Complexity:
-O(1): No extra data structure used. Just a few integer variables.
*/