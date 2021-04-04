//Container with most water
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YEs 
// Any problem you faced while coding this :No
/*
two pointer solution 
take a pointer from left and another from right, we take the mini of heights 
at both the pointer & then max of area between both pointer to measure water capacity
*/

public class Problem3 {
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
    public static int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        //take 2 pointers left & right
        int left = 0, right = n-1;
        while(left < right){
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, min * (right -left));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right --;
            }
        }
        return max;
    }
    
}
