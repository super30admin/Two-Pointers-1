class Solution {
    public int maxArea(int[] height) {
        /*
        Time complexity: O(n)
        Space complexity: O(1)
        */
        
        // check if the height array is empty or not
        if (height == null || height.length == 0){
            return 0;
        }
        
        int left = 0;
        int right = height.length - 1;
        int width = 0;
        int max_area = 0;
        
        //check if left is lesser than right or not
        while(left < right){
            // calculate the new width, curr_area
            width = right - left;
            int curr_area = Math.min(height[left], height[right]) * width;
            // compare the curr_area with max_area
            if(max_area < curr_area){
                // update the max_area
                max_area = curr_area;
            }
            // check which value is lesser then
            if (height[left] < height[right]){
                // increment left if left is smaller
                left += 1;
            }else if(height[left] > height[right]){
                // decrement if right is smaller
                right -= 1;
            }else{
                // increment/decrement any one ptr if both are same.
                left += 1;
            }
            
        }
        // return the max_area
        return max_area;
        
    }
}