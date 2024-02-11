//TC: O(n^2)
//SC: O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (i != 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int l = i + 1;
      int h = nums.length - 1;
      int temp = (-1) * nums[i];

      while (l < h) {

        if (temp == nums[l] + nums[h]) {
          result.add(new ArrayList(Arrays.asList(nums[i], nums[l], nums[h])));
          l++;
          h--;
          while (l < h && nums[l] == nums[l - 1]) {
            l++;
          }
          while (l < h && nums[h] == nums[h + 1]) {
            h--;
          }
        } else if (temp < nums[l] + nums[h]) {
          h--;
        } else if (temp > nums[l] + nums[h]) {
          l++;
        }
      }
    }
    return result;
  }

}

//class Solution {
//  public List<List<Integer>> threeSum(int[] nums) {
//    HashSet<List<Integer>> result = new HashSet<List<Integer>>();
//
//    for (int i =0; i < nums.length; i++){
//      Set<Integer> set = new HashSet<Integer>();
//
//      int target =0-nums[i];
//
//      for (int j =i+1; j < nums.length; j++){
//
//        int diff = target - nums[j];
//
//        if(set.contains(diff)){
//          List<Integer> pair = new ArrayList<>();
//          pair.add(diff);
//          pair.add(nums[j]);
//          pair.add(nums[i]);
//
//          Collections.sort(pair);
//          result.add(pair);
//        }
//        else{
//          set.add(nums[j]);
//        }
//      }
//    }
//    return new ArrayList<>(result);
//  }
//}