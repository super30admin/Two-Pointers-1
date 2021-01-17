/*
Brute force, take one element, compare with the rest
Do for all elements and store the ma
Run time would be O(N^2)
Why 2 - pointers?
If we move the pointers towards each other from opposite ends while keeping track of the area between the pointers, and move whichever pointer is the minimum between the two since that is the area's constrain which allows us to then find higher areas. 
*/


class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0; int low = 0; int high = height.length-1;
        while(low < high){
            max = Math.max(max, Math.min(height[low],height[high]) * (high-low));
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        
        return max;
    }
}


