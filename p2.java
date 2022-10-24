// TC: O(nlogn)
// SC: O(1)

// Approach: Sort the array and follow two pointers approach.


class Solution {

  public List<List<Integer>> threeSum(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int start = 0;
    int next = 0;
    int last = 0;

    List<List<Integer>> res = new ArrayList<>();

    while(start < n) {
      next = start + 1; last = n-1;

      while(next < last) {
        int sum = arr[next] + arr[last] + arr[start];

        if(sum == 0) {
          res.add(Arrays.asList(arr[start], arr[next], arr[last]));
        }

        if(sum <= 0) {
          ++next;
          while(next < last && arr[next] == arr[next-1])
            next++;
        }
        else {
          --last;
          while(next < last && arr[last] == arr[last+1])
            last--;
        }
      }
      ++start;
      while( start < n && arr[start] == arr[start-1])
        start++;

    }
    return res;
  }}