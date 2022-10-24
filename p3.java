// TC: O(n)
// SC: O(1)


class Solution {
  public int maxArea(int[] arr) {
    int start = 0, end = arr.length-1;
    int ans = Integer.MIN_VALUE;
    while(start <= end) {
      int val = (Math.min(arr[start], arr[end]) * (end-start));
      ans = Math.max(ans, val);
      if(arr[start] < arr[end]) {
        start++;
      }
      else {
        end--;
      }
    }
    return ans;

  }
}