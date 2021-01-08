// Time Complexity : O(n), n is the number of height elements in array

// Space Complexity :O(1) 

// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no
/*
approach is to make use of 2 pointers.
initialize left pointer to start of array and right pointer to end
iterate until left != right and find the min of left and right as that is the length of water container

find volume and update max volume. 
Move the left and right pointer to greater height side .

*/
class MaxWater {
    public int maxArea(int[] heights) {
        if (heights.length ==0){
            return 0;
        }
        
        
        int left = 0;
        int right = heights.length-1;

        int maxWater = Integer.MIN_VALUE;
        while (left != right){

            int currHt = Math.min(heights[left],heights[right]);
            //calculate dist between left and right;
            int currdist = (right-left);

            int currVol = currHt * currdist;
            if (currVol > maxWater){
                maxWater = currVol;
            }

            if (heights[left] < heights[right]){
                left++;
            }else {
                right--;
            }

        }
        return maxWater;
    }
}