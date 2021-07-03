//time complexity O(n)
//space complexity O(1)

class Solution {
 public List < List < Integer >> threeSum(int[] nums) {
  List < List < Integer >> triplets = new ArrayList < > ();
  Arrays.sort(nums);
  if (nums == null || nums.length < 3) return triplets;
  for (int i = 0; i < nums.length - 2; i++) {
   if (i > 0 && nums[i] == nums[i - 1]) continue;
   int low = i + 1;
   int high = nums.length - 1;
   while (low < high) {
    int sum = nums[i] + nums[low] + nums[high];
    if (sum == 0) {
     triplets.add(Arrays.asList(nums[i], nums[low], nums[high]));
     low++;
     high--;
     while (low < high && nums[low] == nums[low - 1]) low++;
     while (low < high && nums[high] == nums[high + 1]) high--;
    } else if (sum < 0) {
     low++;
    } else {
     high--;
    }
   }
  }
  return triplets;
 }
}
