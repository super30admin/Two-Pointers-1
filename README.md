# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
class Solution {
    public void sortColors(int... nums) {

int low = 0;

int mid = 0;

int high = nums.length - 1;

while (mid <= high)

if (nums[mid] == 1)

mid++;

else if (nums[mid] == 0)

swap(nums, low++, mid++);

else

swap(nums, mid, high--);

}

private void swap(int[] nums, int i, int j) {

int temp = nums[i];

nums[i] = nums[j];

nums[j] = temp;

}
}

## Problem2 (https://leetcode.com/problems/3sum/)
class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
       HashSet <List<Integer>> set = new HashSet<>();
       int n = nums.length;
       for( int i = 0; i < n-2; i++){
           for(int j = i+1; j < n-1; j++){
               for(int k = j+1; k < n; k++){
                   int sum = nums[i]+ nums[j] + nums[k];
                   if(sum == 0){
                       List<Integer> myList = Arrays.asList(nums[i],nums[j],nums[k]);
                       Collections.sort(myList);
                       set.add(myList);
                   }
               }
           }
       }
       return new ArrayList<>(set);
   }
}

## Problem3 (https://leetcode.com/problems/container-with-most-water/)

class Solution {

   public int maxArea(int[] height) {

      int max = 0;

       for(int i = 0; i < height.length; i++){

           for(int j = i+1; j < height.length; j++){

               int currentArea = Math.min(height[i], height[j]) * (j - i);

               max = Math.max(max, currentArea);

           }

       }

       return max;

   }

}