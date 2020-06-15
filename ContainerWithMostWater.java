// Bruteforce solution
//Time complexity for this bruteforce solution is O(n*n) where n is size of height array and space complexity is O(1)
class Solution {
  public int maxArea(int[] height) {
    if(height.length == 0)
      return 0;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<height.length-1;i++){
      for(int j=i+1;j<height.length;j++){
        int area = Math.min(height[i],height[j]) * (j - i);
        if(max < area)
          max = area;
      }
    }
    return max;
  }
}

// Optimal solution
//Time complexity for this optimal solution is O(n) where n is size of height array and space complexity is O(1)

class Solution {
  public int maxArea(int[] height) {
    if(height.length == 0)
      return 0;
    int low=0;int high=height.length - 1;
    int max = Integer.MIN_VALUE;
    while(low < high){
      int value = Math.min(height[low], height[high]) * (high-low);
      if(max < value)
        max = value;
      if(height[low] < height[high])
        low++;
      else
        high--;
    }
    return max;
  }
}