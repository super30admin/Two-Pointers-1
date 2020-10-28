//Time complexity: O(n) 
//Space complexity: O(1)
//Program successfully
/*
    Algorithm: 1. Exploiting the idea that the height is always determined by the smaller value
               2. We set two pointers low and high. Low is initialized to the first element and high is initialized to the last element of array
               3. We check which of the height is minimum and calculate the area considering the minimum height of the two
               4. We modify the pointers according to which index has the min height 
*/
class waterFill {
    public int maxArea(int[] height) {
        if(height.length == 0 || height == null) return 0;
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while(low < high){
            max = Math.max(max,Math.min(height[low],height[high]) * (high - low));
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
}
