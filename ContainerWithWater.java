// Time Complexity : O(n) [As we are using two pointers and iterating through array once]
// Space Complexity : O(1) [As we do not use auxilary space]
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach
/*We use two pointer approach as we start with left pointer at index 0 and right pointer at last index.
we calculate the area between the left and right pointer.
Area = width(distance between the index) * height(min of left and right pointer as the container cannot be slant)
we move the pointer with min value as there ara chances to find high value.
Keep moving left and right pointer according which has low value until they point at same index. 
Return the max value.
 * 
 */
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0) return 0;
        int max = 0;//to calculate area = width *height
        int leftPointer= 0, rightPointer = height.length -1;
        while(leftPointer<rightPointer){ //even left <= right would work as the width would be 0 and we are taking max here for final result
            max = Math.max(max,Math.min(height[leftPointer],height[rightPointer]) * (rightPointer - leftPointer));
            if(height[leftPointer] < height[rightPointer]){
                //To get maximum area
                leftPointer++;
            }
            else{
rightPointer--;
            }
        
    }
    return max;
}
}

// Time Complexity : O(n^2) [Brute force]
// Space Complexity : O(1) [As we do not use auxilary space]
// Did this code successfully run on Leetcode : No (time limit exceeded)
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach
//We use brute force and take the first and second element and compute area
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0) return 0;
        int max = 0, area;
        int leftPointer= 0, rightPointer = height.length -1;
for(int i=0;i< height.length;i++){
    for(int j=i+1;j<height.length;j++){
        max = Math.max(max,Math.min(height[i],height[j]) * (j-i));
    }

}
    return max;
}
}