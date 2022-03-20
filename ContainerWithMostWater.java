public class ContainerWithMostWater {
  /**
   * Approach:
   *    We are always limited by the lowest height container, so move the pointer pointing to the small container.
   * 
   * Time Complexity: O(n)
   * Space complexity: O(1)
   * 
   * Were you able to solve this on leetcode? Yes
   * Any issues solving this on leetcode? No
   * 
   */
  public int maxArea(int[] height) {
    int left = 0, right = height.length-1;
    
    int area = Integer.MIN_VALUE;
    while(left < right){
        int currArea = (right - left) * (Math.min(height[left], height[right]));
        
        area = Math.max(area, currArea);
        if(height[left] < height[right]){
            left++;
        } else {
            right--;
        }
    }
    
    return area;
}
}
