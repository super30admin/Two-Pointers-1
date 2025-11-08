/**** Method 1 ****/
//Time Complexity: O(n^2)
//Space Complexity: O(1)

//TLE when submitted in LeetCode

//Take two loops and for each and every pair calculate the area using min of both heights and length between them(j-i) and update the max area.

/**** Method 2 ****/
//Time Complexity: O(n)
//Space Complexity: O(1)

//Successfully submitted in LeetCode

//Take two pointers and calculate the area using min of both heights and length between them(right-left), then move index with has min height as we need max area and update the max area.

public class TW1_11_Container_With_Most_Water {

  /**** Method 1 ****/
  public int maxArea(int[] height) {
    int ans = 0;

    for (int i = 0; i < height.length; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int area = Math.min(height[i], height[j]) * (j - i);
        ans = Math.max(ans, area);
      }
    }
    return ans;
  }

  /**** Method 2 ****/
  public int maxArea1(int[] height) {
    int ans = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      int area = Math.min(height[left], height[right]) * (right - left);
      ans = Math.max(ans, area);

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return ans;
  }
}
